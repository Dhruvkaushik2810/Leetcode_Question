// Last updated: 7/26/2026, 10:24:49 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int low=0;
4        int high=nums.length-1;
5        int [] arr = {-1,-1};
6        while(low<=high){
7            int mid=low+(high-low)/2;
8            if(nums[mid]==target){
9                arr[0]=mid;
10                high = mid - 1;
11            }
12            else if(nums[mid]<target){
13                low=mid+1;
14            }
15            else{
16                high=mid-1;
17            }
18        }
19        low = 0;
20        high = nums.length - 1;
21        while(low<=high){
22            int mid=low+(high-low)/2;
23            if(nums[mid]==target){
24                arr[1]=mid;
25                low = mid + 1;
26            }
27            else if(nums[mid]<target){
28                low=mid+1;
29            }
30            else{
31                high=mid-1;
32            }
33        }
34        return arr;
35    }
36}