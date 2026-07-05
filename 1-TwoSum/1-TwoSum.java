// Last updated: 7/5/2026, 4:04:35 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        
4        int n=nums.length;
5        for(int i=0;i<n-1;i++){
6            for(int j=i+1;j<n;j++){
7                if(nums[i]+nums[j]==target){
8                    return new int[]{i,j};
9                }
10            }
11        }
12        return new int[]{-1,-1};
13    }
14}