// Last updated: 9/11/2026, 11:24:07 AM
1class Solution {
2    public int[] buildArray(int[] nums) {
3        int n=nums.length;
4        int ans[]=new int[n];
5        for(int i=0;i<n;i++){
6            ans[i]=nums[nums[i]];
7        }
8        return ans;
9    }
10}