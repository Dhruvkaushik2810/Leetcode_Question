// Last updated: 7/5/2026, 4:35:26 PM
1class Solution {
2    public void sortColors(int[] nums) {
3       int n=nums.length;
4       for(int i=0;i<n-1;i++){
5        for(int j=0;j<n-i-1;j++){
6            if(nums[j]>nums[j+1]){
7                int temp=nums[j];
8                nums[j]=nums[j+1];
9                nums[j+1]=temp;
10            }
11        }
12       } 
13    }
14}