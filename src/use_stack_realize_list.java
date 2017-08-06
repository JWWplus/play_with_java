/**
 * Created by jiangweiwei on 17-7-19.
 * 用2个栈实现队列
 */
import java.util.Stack;

//栈1用于存储元素，栈2用于弹出元素，负负得正。
public class use_stack_realize_list {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        int first = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return first;
    }

}
