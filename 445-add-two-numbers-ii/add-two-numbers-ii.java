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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> sl1 = new Stack<>();
        Stack<Integer> sl2 = new Stack<>();
        while(l1!=null){
            sl1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            sl2.push(l2.val);
            l2 = l2.next;
        }
    ListNode head = null;
    int carry = 0;
    while(!sl1.isEmpty() || !sl2.isEmpty() || carry!=0){
        int sum = carry;
        if(!sl1.isEmpty()) sum += sl1.pop();
        if(!sl2.isEmpty()) sum += sl2.pop();
        carry = sum/10;
        ListNode node = new ListNode(sum%10);
        node.next = head; 
        head = node;
    }
    return head;
    }
}