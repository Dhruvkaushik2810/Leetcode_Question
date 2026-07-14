// Last updated: 7/14/2026, 11:39:01 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        List<List<Integer>> ans= new ArrayList<>();
6        for(int i=0;i<n-2;i++){
7            if(i>0 && nums[i]==nums[i-1]){
8                continue;
9            }
10            int left=i+1;
11            int right=n-1;
12            while(left<right){
13                int sum=nums[i]+nums[left]+nums[right];
14                if(sum==0){
15                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
16                
17                left++;
18                right--;
19                while(left<right && nums[left]==nums[left-1]){
20                    left++;
21                }
22                while(left<right && nums[right]==nums[right+1]){
23                    right--;
24                }
25            }
26
27            else if(sum<0){
28                left++;
29            }
30             else{
31                right--;
32            }
33            }
34       }
35        return ans;
36    }
37}