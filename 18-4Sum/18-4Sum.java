// Last updated: 7/15/2026, 11:28:04 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> list=new ArrayList<>();
4        Arrays.sort(nums);
5        int n=nums.length;
6        for(int i=0;i<n-3;i++){
7            if(i>0 && nums[i]==nums[i-1]){
8                continue;
9            }
10            for(int j=i+1;j<n-2;j++){
11                if(j>i+1 && nums[j]==nums[j-1]){
12                    continue;
13                }
14                int left=j+1;
15                int right=n-1;
16                while(left<right){
17                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
18                    if(sum==target){
19                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
20                        left++;
21                        right--;
22                        while(left<right && nums[left]==nums[left-1]){
23                            left++;
24                        }
25                        while(left<right && nums[right]==nums[right+1]){
26                            right--;
27                        }
28                    }
29                    else if(sum<target){
30                        left++;
31                    }
32                    else{
33                        right--;
34                    }
35                }
36            }
37        }
38        return list;   
39    }
40}