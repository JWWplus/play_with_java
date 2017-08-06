import java.util.ArrayList;
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {

        ArrayList<ListNode> list = new ArrayList<ListNode>();
        ListNode current = head;
        int size=0;  //存储链表的容量。
        while(current!=null){
            size++;
            list.add(current);  //将结点添加到列表中。
            current=current.next;
        }
        System.out.println("size----"+size);
        if(k<=0 || k>size){ //判断k的合法性。
            return null;
        }else{
            current = list.get(size-k); //下标从0开始。
            return current;
        }
    }
}