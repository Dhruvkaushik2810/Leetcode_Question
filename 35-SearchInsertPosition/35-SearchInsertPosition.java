// Last updated: 9/11/2026, 3:05:54 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5        while (low <= high) {
6            int mid = low + (high - low) / 2;
7            if (nums[mid] == target) {
8                return mid;
9            }
10            if (nums[low] <= nums[mid]) {
11                if (nums[low] <= target && target < nums[mid]) {
12                    high = mid - 1;
13                } else {
14                    low = mid + 1;
15                }
16            }
17            else {
18
19                if (nums[mid] < target && target <= nums[high]) {
20                    low = mid + 1;
21                } else {
22                    high = mid - 1;
23                }
24            }
25        }
26        
27        return -1;
28    }
29}