/**
 * Created by jiangweiwei on 17-8-2.
 */
public class merge_list {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if ((list1 == null) && (list2 == null)){
            return null;
        } else if (list2 == null){
            return list1;
        } else if (list1 == null){
            return list2;
        }
        ListNode head = null;
        if (list1.val < list2.val){
            head = list1;
            head.next = Merge(list1.next, list2);
        } else {
            head = list2;
            head.next = Merge(list2.next, list1);
        }
        return head;
    }
}
