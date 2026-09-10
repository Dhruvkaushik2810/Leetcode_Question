// Last updated: 9/10/2026, 11:06:20 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n=digits.length;
4        ArrayList<Integer> nums = new ArrayList<>();
5        int carry=1;
6        for(int i=n-1;i>=0;i--){
7            int sum=digits[i]+carry;
8            int temp=sum%10;
9            nums.add(temp);
10            sum=sum/10;
11            carry=sum;
12        }
13        if(carry==1){
14            nums.add(carry);
15        }
16        Collections.reverse(nums);
17        int[] result = nums.stream().mapToInt(Integer::intValue).toArray();
18        return result;
19    }
20}