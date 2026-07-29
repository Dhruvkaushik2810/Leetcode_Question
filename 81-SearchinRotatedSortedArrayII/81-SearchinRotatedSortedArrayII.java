// Last updated: 7/29/2026, 10:48:19 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int low=0;
4        int high=nums.length-1;
5        Arrays.sort(nums);
6        while(low<=high){
7            int mid=low+(high-low)/2;
8            if(nums[mid]==target){
9                return true;
10            }
11            else if(nums[mid]<target){
12                low=mid+1;
13            }
14            else{
15                high=mid-1;
16            }
17        }
18        return false;
19    }
20}