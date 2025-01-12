package org.topic.lnkedList;

public class InterviewQuestions {

    /*
        Linked List Cycle
        https://leetcode.com/problems/linked-list-cycle/

    */
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int cycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp == slow);
                return length;
            }
        }
        return 0;
    }


    /*
        Linked List Cycle II
        https://leetcode.com/problems/linked-list-cycle-ii/

     */

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                length = cycleLength(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }

        ListNode f = head;
        ListNode s = head;

        while (length>0){
            s=s.next;
            length--;
        }

        while (f!=s){
            f = f.next;
            s=s.next;
        }
         return s;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
