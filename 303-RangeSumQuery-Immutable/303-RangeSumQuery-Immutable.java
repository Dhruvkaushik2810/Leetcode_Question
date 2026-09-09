// Last updated: 9/9/2026, 10:48:50 PM
1class NumArray {
2    private int [] pre;
3    public NumArray(int[] nums) {
4        pre= new int[nums.length+1];
5        int n=nums.length;
6        for(int i=0;i<n;i++){
7            pre[i+1]=pre[i]+nums[i];
8        }
9    }
10    
11    public int sumRange(int left, int right) {
12        return pre[right+1]-pre[left];
13    }
14}
15
16/**
17 * Your NumArray object will be instantiated and called as such:
18 * NumArray obj = new NumArray(nums);
19 * int param_1 = obj.sumRange(left,right);
20 */