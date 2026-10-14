// Last updated: 10/14/2026, 4:20:09 PM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int n=arr.length;
4        HashSet<Integer> set = new HashSet<>();
5        ArrayList<Integer> list = new ArrayList<>();
6        for(int i:arr){
7            set.add(i);
8        }
9        int count=1;
10        int index=1;
11        while(true){
12            if(!(set.contains(count))){
13                list.add(count);
14                index++;
15            }
16            count++;
17            if(index>k){
18                break;
19            }
20        }
21        return list.get(k-1);
22    }
23}