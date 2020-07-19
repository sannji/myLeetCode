public class LinkedList {
        public static void main(String[] args) {

        }
}


//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode pointer = new ListNode();
        int carrier = 0;
        pointer = l;
        int l2TmpVal, l1TmpVal = 0;
        while(l1 != null || l2 != null) {
                l2TmpVal = l2!=null? l2.val : 0;
                l1TmpVal = l1!=null? l1.val : 0;
                ListNode tmp = new ListNode();
                tmp.val = (carrier + l2TmpVal + l1TmpVal) % 10;
                carrier = (carrier + l2TmpVal + l1TmpVal) / 10;
                pointer.next = tmp;
                pointer = pointer.next;
                l1 = l1 != null? l1.next : null;
                l2 = l2 != null? l2.next : null;
        }
        if (carrier > 0) {
                ListNode tmp = new ListNode();
                tmp.val = carrier;
                tmp.next = null;
                pointer.next = tmp;
        }
        return l.next;
    }
}
