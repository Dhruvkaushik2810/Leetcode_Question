// Last updated: 7/8/2026, 11:18:23 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n=nums.length;
4        int p=-1;
5        for(int i=n-2;i>=0;i--){
6            if(nums[i]<nums[i+1]){
7                p=i;
8                break;
9            }
10        }
11        if(p!=-1){
12            for(int j=n-1;j>p;j--){
13                if(nums[j]>nums[p]){
14                    int temp = nums[p];
15                    nums[p] = nums[j];
16                    nums[j] = temp;
17                    break;
18                }
19            }
20        }
21        int left=p+1;
22        int right=n-1;
23        while(left<right){
24            int temp=nums[left];
25            nums[left]=nums[right];
26            nums[right]=temp;
27            left++;
28            right--;
29        }
30    }
31}