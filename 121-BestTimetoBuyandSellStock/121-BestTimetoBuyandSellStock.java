// Last updated: 7/6/2026, 6:42:49 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        int min=Integer.MAX_VALUE;
5        for(int price:prices){
6           if(price<min){
7            min=price;
8           }
9           else if(price-min>max){
10            max=price-min;
11           }
12        }
13        return max;
14    }
15}