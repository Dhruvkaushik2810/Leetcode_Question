// Last updated: 9/20/2026, 8:36:47 PM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        int count = 0;
4
5        for (int x = 1; x <= 100; x++) {
6            int first = -1;
7            int second = -1;
8            int third = -1;
9            int freq = 0;
10
11            for (int i = 0; i < nums.length; i++) {
12                if (nums[i] == x) {
13                    freq++;
14
15                    if (freq == 1) {
16                        first = i;
17                    } else if (freq == 2) {
18                        second = i;
19                    } else if (freq == 3) {
20                        third = i;
21                    }
22                }
23            }
24
25            if (freq == 3 && second - first == third - second) {
26                count++;
27            }
28        }
29
30        return count;
31    }
32}