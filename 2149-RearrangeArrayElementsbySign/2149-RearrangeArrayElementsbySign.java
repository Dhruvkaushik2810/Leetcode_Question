// Last updated: 7/22/2026, 10:11:11 PM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int l=nums.length;
4        int p=0;
5        int n=1;
6        int []arr=new int[l];
7        for(int i=0;i<l;i++){
8           if(nums[i]>0){
9            arr[p]=nums[i];
10            p+=2;
11           }
12           else{
13            arr[n]=nums[i];
14            n+=2;
15           }
16        }
17        return arr;
18    }
19}