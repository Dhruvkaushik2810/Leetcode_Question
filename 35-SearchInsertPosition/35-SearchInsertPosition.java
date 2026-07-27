// Last updated: 7/27/2026, 7:05:33 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low=0;
4        int high=nums.length-1;
5        int mid=0;
6        while(low<=high){
7            mid=low+(high-low)/2;
8            if(nums[mid]==target){
9                return mid;
10            }
11            else if(nums[mid]<target){
12                low=mid+1;
13            }
14            else{
15                high=mid-1;
16            }
17        }
18        return low;
19    }
20}