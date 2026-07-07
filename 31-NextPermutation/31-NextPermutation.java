// Last updated: 7/7/2026, 10:12:01 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        // Right se first increasing pair dhoondo.
4
5        // Pivot mil gaya.
6
7        // Right me pivot se bada sabse chhota element dhoondo.
8
9        // Swap.
10
11        // Pivot ke baad reverse.
12        int n=nums.length;
13        int p=-1;
14        for(int i=n-2;i>=0;i--){
15            if(nums[i]<nums[i+1]){
16                p=i;
17                break;
18            }
19        }
20        if(p!=-1){
21            for(int j=n-1;j>p;j--){
22                if(nums[j]>nums[p]){
23                    int temp = nums[p];
24                    nums[p] = nums[j];
25                    nums[j] = temp;
26                    break;
27                }
28            }
29        }
30        int left=p+1;
31        int right=n-1;
32        while(left<right){
33            int temp=nums[left];
34            nums[left]=nums[right];
35            nums[right]=temp;
36            left++;
37            right--;
38        }
39    }
40}