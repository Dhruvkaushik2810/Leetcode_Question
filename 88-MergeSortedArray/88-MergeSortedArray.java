// Last updated: 7/17/2026, 3:45:28 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        for(int i=0;i<n;i++){
5            nums1[m+i]=nums2[i];
6        }
7        Arrays.sort(nums1);
8    }
9}