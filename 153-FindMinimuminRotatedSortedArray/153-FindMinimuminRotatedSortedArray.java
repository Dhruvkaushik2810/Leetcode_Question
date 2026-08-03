// Last updated: 8/3/2026, 9:20:12 PM
1class Solution {
2    public int findMin(int[] nums) {
3       int low =0;
4       int high=nums.length-1;
5       int a=nums[0];
6       while(low<high){
7        int mid=low+(high-low)/2;
8        if(nums[mid]>nums[high]){
9            low=mid+1;
10        }
11        else{
12            high=mid;
13        }
14       } 
15       return nums[low];
16    }
17}