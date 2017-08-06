/**
 * Created by jiangweiwei on 17-7-18.
 * 反向输出list
 */
import java.util.ArrayList;
import java.util.Stack;

public class list_node {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack_int_node = new Stack<>();
        while(listNode != null) {
            stack_int_node.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack_int_node.isEmpty()) {
            list.add(stack_int_node.pop());
        }
        return list;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
            this.val = val;
        }
}