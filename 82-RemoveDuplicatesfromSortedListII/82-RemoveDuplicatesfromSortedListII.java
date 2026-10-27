// Last updated: 10/27/2026, 10:36:07 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode list=new ListNode(-1);
4        list.next=head;
5        ListNode prev=list;
6        ListNode curr=head;
7        while(curr!=null && curr.next!=null){
8            if(curr.val==curr.next.val){
9                while(curr.next != null && curr.val==curr.next.val){
10                    curr=curr.next;
11                }
12                prev.next = curr.next;
13            }else{
14                prev=prev.next;
15            }
16            curr=curr.next;
17        }
18        return list.next;
19    }
20}