/**
 * Created by jiangweiwei on 17-7-19.
 * 链表实现队列
 */
public class realize_quene {
    node head;
    node current;

    class node {
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }

    public void push(int data){
        if (head == null) {
            head = new node(data);
            current = head;
        } else {
            node push_node = new node(data);
            current.next = push_node;
            current = push_node;
        }
    }
    
    public node pop(){
        if (head == null){
            return null;
        } else {
            node head_node = head;
            head = head.next;
            return head_node;
        }
    }
    
    public static void main(String[] args) {
        realize_quene quene = new realize_quene();

        quene.push(1);
        quene.push(2);
        quene.push(3);
        
        System.out.println(quene.pop().data);
        System.out.println(quene.pop().data);
        System.out.println(quene.pop().data);
    }
}