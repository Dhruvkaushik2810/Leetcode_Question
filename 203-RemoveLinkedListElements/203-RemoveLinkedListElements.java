// Last updated: 5/18/2026, 12:14:09 PM
1class Solution {
2    public ListNode removeElements(ListNode head, int val) {
3        ListNode slow=new ListNode(0);
4        slow.next =head;
5        ListNode curr=slow;
6        while(curr.next!=null){
7           
8            if(curr.next.val==val){
9                curr.next=curr.next.next;
10            }else{
11                curr=curr.next;
12            }
13        }
14        return slow.next;
15    }
16}