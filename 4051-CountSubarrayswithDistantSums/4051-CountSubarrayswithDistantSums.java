// Last updated: 9/21/2026, 7:50:22 PM
1import java.util.*;
2
3class Solution {
4    public long distantSubarrays(int[] nums, int goal, int k) {
5        int n = nums.length;
6
7        if (k == 0) {
8            return (long) n * (n + 1) / 2;
9        }
10
11        long[] prefix = new long[n + 1];
12
13        for (int i = 0; i < n; i++) {
14            prefix[i + 1] = prefix[i] + nums[i];
15        }
16
17        long[] sorted = prefix.clone();
18        Arrays.sort(sorted);
19
20        int[] bit = new int[n + 2];
21        long answer = 0;
22
23        int pos = lowerBound(sorted, prefix[0]) + 1;
24        add(bit, pos, 1);
25
26        for (int i = 1; i <= n; i++) {
27            long current = prefix[i];
28
29            long leftLimit = current - (long) goal - k;
30            long rightLimit = current - (long) goal + k;
31
32            int leftPos = upperBound(sorted, leftLimit);
33            long leftCount = query(bit, leftPos);
34
35            int rightPos = lowerBound(sorted, rightLimit);
36            long lessThanRight = query(bit, rightPos);
37
38            long rightCount = i - lessThanRight;
39
40            answer += leftCount + rightCount;
41
42            pos = lowerBound(sorted, current) + 1;
43            add(bit, pos, 1);
44        }
45
46        return answer;
47    }
48
49    private void add(int[] bit, int index, int value) {
50        while (index < bit.length) {
51            bit[index] += value;
52            index += index & -index;
53        }
54    }
55
56    private int query(int[] bit, int index) {
57        int sum = 0;
58
59        while (index > 0) {
60            sum += bit[index];
61            index -= index & -index;
62        }
63
64        return sum;
65    }
66
67    private int lowerBound(long[] arr, long target) {
68        int low = 0;
69        int high = arr.length;
70
71        while (low < high) {
72            int mid = low + (high - low) / 2;
73
74            if (arr[mid] < target) {
75                low = mid + 1;
76            } else {
77                high = mid;
78            }
79        }
80
81        return low;
82    }
83
84    private int upperBound(long[] arr, long target) {
85        int low = 0;
86        int high = arr.length;
87
88        while (low < high) {
89            int mid = low + (high - low) / 2;
90
91            if (arr[mid] <= target) {
92                low = mid + 1;
93            } else {
94                high = mid;
95            }
96        }
97
98        return low;
99    }
100}