// Last updated: 9/10/2026, 11:02:58 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n=digits.length;
4        ArrayList<Integer> nums = new ArrayList<>();
5        int sum=digits[digits.length-1]+1;
6        int temp=sum%10;
7        nums.add(temp);
8        sum=sum/10;
9        int carry=sum;
10        for(int i=n-2;i>=0;i--){
11            sum=digits[i]+carry;
12            temp=sum%10;
13            nums.add(temp);
14            sum=sum/10;
15            carry=sum;
16        }
17        if(carry==1){
18            nums.add(carry);
19        }
20        Collections.reverse(nums);
21        int[] result = nums.stream().mapToInt(Integer::intValue).toArray();
22        return result;
23    }
24}