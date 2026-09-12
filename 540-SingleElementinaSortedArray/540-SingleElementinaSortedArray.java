// Last updated: 9/12/2026, 4:25:35 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n=nums.length;
4        int low=0;
5        int high=nums.length-1;
6        while(low<high){
7            int mid=low+(high-low)/2;
8            
9            if(mid%2!=0){
10                mid--;
11            }
12            if(nums[mid]==nums[mid+1]){
13                low=mid+2;
14            }
15            else{
16                high=mid;
17            }
18        }
19        return nums[low];
20    }
21}