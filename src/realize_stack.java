/**
 * Created by jiangweiwei on 17-7-19.
 * 链表实现栈
 */
public class realize_stack {
    public node head;
    public node current;
    class node {
        int data;
        node pre;

        public node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        if (current == null) {
            head = new node(data);
            current = head;
        }
        else {
            node push_new_node = new node(data);
            push_new_node.pre = current;
            current = push_new_node;
        }
    }

    public node pop(){
        if (current == null) {
            return null;
        }
        else {
            node pop_node = current;
            current = current.pre;
            return pop_node;
        }
    }

    public static void main(String[] args){
        realize_stack stack = new realize_stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
    }

}