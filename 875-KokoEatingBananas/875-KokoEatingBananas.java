// Last updated: 9/14/2026, 7:34:45 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low = 1;
4        int high = 0;
5        for (int pile : piles) {
6            high = Math.max(high, pile);
7        }
8        int ans = high;
9        while (low <= high) {
10            int mid = low + (high - low) / 2;
11            int totalHours = 0;
12            for (int pile : piles) {
13                totalHours += Math.ceil((double) pile / mid);
14            }
15            if (totalHours <= h) {
16                ans = mid;
17                high = mid - 1;
18            } else {
19                low = mid + 1;
20            }
21        }
22        return ans;
23    }
24}