// Last updated: 7/11/2026, 9:51:46 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3     int n=nums.length;
4     if(n==1){
5        return nums[0];
6     }   
7     int ans=0;
8     for(int i=0;i<n;i++){
9        ans=ans^nums[i];
10     }
11     return ans;
12    }
13}