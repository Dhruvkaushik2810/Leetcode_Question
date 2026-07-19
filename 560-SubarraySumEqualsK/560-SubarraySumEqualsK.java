// Last updated: 7/19/2026, 10:11:58 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n=nums.length;
4        HashMap<Integer, Integer> map=new HashMap<>();
5        map.put(0,1);
6        int count=0;
7        int sum=0;
8        for(int i=0;i<n;i++){
9            sum+=nums[i];
10            if(map.containsKey(sum-k)){
11               count += map.get(sum - k);
12            }
13            map.put(sum, map.getOrDefault(sum, 0) + 1);
14        }
15        return count;
16    }
17}