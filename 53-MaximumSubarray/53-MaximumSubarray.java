// Last updated: 7/6/2026, 6:14:26 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n=nums.length;
4        int sum=0;
5        int tsum=nums[0]; 
6        for(int i=0;i<n;i++){
7            sum+=nums[i];
8            if(sum>tsum){
9                tsum=sum;
10            }
11            if(sum<0){
12                sum=0;
13            }
14        }
15        return tsum;
16    }
17}