// Last updated: 8/26/2026, 4:23:35 PM
1import java.util.Arrays;
2
3class Solution {
4    public int numRescueBoats(int[] people, int limit) {
5
6        Arrays.sort(people);
7
8        int left = 0;
9        int right = people.length - 1;
10        int boats = 0;
11
12        while (left <= right) {
13
14            if (people[left] + people[right] <= limit) {
15                left++;
16            }
17
18            right--;
19            boats++;
20        }
21
22        return boats;
23    }
24}