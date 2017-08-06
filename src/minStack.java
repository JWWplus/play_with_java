/**
 * Created by jiangweiwei on 17-8-6.
 */
public class minStack {
    private myStack<Integer> minstack = new myStack<Integer>();
    private myStack<Integer> dataStack = new myStack<Integer>();

    public void push(Integer data){
        dataStack.push(data);
        if (minstack.head == null || minstack.head.data > data){
            minstack.push(data);
        } else {
            minstack.push(minstack.head.data);
        }
    }

    public Integer pop(){
        if (dataStack.length == 0 || minstack.length == 0){
            return null;
        }
        dataStack.pop();

    }

    public Integer min(){

    }
}

class listnode<T>{
    T data;
    listnode<T> next;
}

class myStack<T>{
    public listnode<T> head;
    public int length;

    public void push(T item){
        listnode<T> Nodes = new listnode<T>();
        Nodes.data = item;
        Nodes.next = head;
        length++;
        head = Nodes;
    }

    public T pop(){
        if (head == null){
            return null;
        }
        length++;
        listnode<T> temp = head;
        head = head.next;
        return temp.data;
    }
}
