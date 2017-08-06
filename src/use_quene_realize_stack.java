/**
 * Created by jiangweiwei on 17-7-19.
 * 使用2个队列实现栈
 */
import java.util.LinkedList;

public class use_quene_realize_stack {
    LinkedList<Integer> queue1 = new LinkedList<Integer>();
    LinkedList<Integer> queue2 = new LinkedList<Integer>();

    public void push(int data){
        if(!queue2.isEmpty()){
            queue2.offer(data);
        } else {
            queue1.offer(data);
        }
    }

    public int pop(){
        if (!check_is_boolean()) {
            if (queue1.isEmpty()) {
                while (queue2.size() > 1) {
                    queue1.offer(queue2.poll());
                }
                return queue2.poll();
            } else {
                while (queue1.size() > 1) {
                    queue2.offer(queue1.poll());
                }
                return queue1.poll();
            }
        } else {
            System.out.print("no data in stack");
            return -1;
        }
    }

    public boolean check_is_boolean(){
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        use_quene_realize_stack stack = new use_quene_realize_stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
