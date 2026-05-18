// Last updated: 5/18/2026, 11:52:05 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow=head;
15        ListNode fast=head;
16        while(fast!=null && fast.next!=null){
17            slow=slow.next;
18            fast=fast.next.next;
19            if(slow==fast){
20                ListNode start=head;
21                while(start!=slow){
22                    start=start.next;
23                    slow=slow.next;
24                }
25                return start;
26            }
27        }
28        return null;
29    }
30}