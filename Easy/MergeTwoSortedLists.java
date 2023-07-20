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

 //Two solutions provided below, one is recursive the other is iterative
class MergeTwoSortedLists {

    public ListNode recursive(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return (list1 == null) ? list2 : list1;
        }

        if(list1.val < list2.val){
            ListNode nextList = new ListNode(list1.val, recursive(list1.next, list2));
            return nextList;
        }else{
            ListNode nextList = new ListNode(list2.val, recursive(list1, list2.next));
            return nextList;
        }
    }

    public ListNode iterative(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tmp = head;
        if(list1 == null || list2 == null){
            head = (list1 == null) ? list2 : list1;
            return head;
        }
        while(true){
            if(list1.val < list2.val){
                tmp.val = list1.val;
                list1 = list1.next;
            }else if(list2.val < list1.val){
                tmp.val = list2.val;
                list2 = list2.next;
            }else{
                tmp.val = list1.val;
                list1 = list1.next;
                tmp.next = new ListNode();
                tmp = tmp.next;
                tmp.val = list2.val;
                list2 = list2.next;
            }
            if(list1 == null || list2 == null){
                break;
            }else{
                tmp.next = new ListNode();
                tmp = tmp.next;
            }
        }

        if(list1 == null && list2 != null){
            tmp.next = new ListNode();
            tmp = tmp.next;
            tmp.val = list2.val;
            tmp.next = list2.next;
        }else if (list2 == null && list1 != null){
            tmp.next = new ListNode();
            tmp = tmp.next;
            tmp.val = list1.val;
            tmp.next = list1.next;
        }
        return head;
    }
}