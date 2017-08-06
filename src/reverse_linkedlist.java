/**
 * Created by jiangweiwei on 17-7-31.
 */

public class reverse_linkedlist {
    public static void main(String[] args){
    }

    public ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }
        ListNode current = head;
        ListNode pre = null;

        while (current != null){
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
