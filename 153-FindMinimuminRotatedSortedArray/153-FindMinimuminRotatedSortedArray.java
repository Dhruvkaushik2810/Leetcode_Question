// Last updated: 9/25/2026, 12:32:04 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int low=0;
4        int high=nums.length-1;
5        while(low<high){
6            int mid=low+(high-low)/2;
7            if(nums[mid]>nums[high]){
8                low=mid+1;
9            }else{
10                high=mid;
11            }
12        }
13        return nums[low];
14    }
15}