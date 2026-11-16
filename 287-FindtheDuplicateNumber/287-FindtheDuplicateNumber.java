// Last updated: 11/16/2026, 10:10:57 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        for(int i=1;i<nums.length;i++){
5            if(nums[i-1]==nums[i]){
6                return nums[i];
7            }
8        }
9        return 0;
10    }
11}