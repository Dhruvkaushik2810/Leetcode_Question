// Last updated: 9/16/2026, 4:45:35 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        int gap=0;
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length-1;i++){
6            int diff=nums[i+1]-nums[i];
7            if(gap<diff){
8                gap=diff;
9            }
10        }
11        return gap;
12    }
13}