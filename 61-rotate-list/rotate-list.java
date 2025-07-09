/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private static ListNode removetail(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        return curr;
    } 
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        k=k%length;
        while(k-- >0){
            ListNode tail=removetail(head);
            tail.next=head;
            head=tail;
        }
        return head;
    }
}