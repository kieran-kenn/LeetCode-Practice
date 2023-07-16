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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recurCall(l1, l2, 0);
    }

    public ListNode recurCall(ListNode l1, ListNode l2, int carry){
        int ans = l1.val + l2.val + carry;
        int singlesPlace = ans % 10;
        int tensPlace = (int)(ans / 10);
        
        if(l1.next == null && l2.next == null){
            if(tensPlace != 0){
                return new ListNode(singlesPlace, new ListNode(tensPlace));
            }else{
                return new ListNode(singlesPlace);
            }
        } else if(l1.next == null){
            return new ListNode(singlesPlace, recurCall(new ListNode(0), l2.next, tensPlace));
        }else if(l2.next == null){
            return new ListNode(singlesPlace, recurCall(l1.next, new ListNode(0), tensPlace));
        }else{
            return new ListNode(singlesPlace, recurCall(l1.next, l2.next, tensPlace));
        }
    }
}