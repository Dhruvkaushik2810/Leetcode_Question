// Last updated: 8/2/2026, 5:37:08 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int  left=nums[0]*nums[1]*nums[n-1];
6        int  right=nums[n-1]*nums[n-2]*nums[n-3];
7        return Math.max(left,right);
8    }
9}