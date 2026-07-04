// Last updated: 7/4/2026, 9:53:21 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k=k%n;
5        reverse(nums,0,n-1);
6        reverse(nums,0,k-1);
7        reverse(nums,k,n-1);
8    }
9    public static void reverse(int arr[],int st,int end){
10        while(st<end){
11            int temp=arr[st];
12            arr[st]=arr[end];
13            arr[end]=temp;
14            st++;
15            end--;
16        }
17    }
18}