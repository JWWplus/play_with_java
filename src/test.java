import java.util.Arrays;
import java.util.LinkedList;

class ticket implements Runnable{
    private int num = 5000;

    @Override
    public void run() {
        while (num > 0){
            sale();
        }
    }

    public synchronized void sale(){
        if (num > 0){
            num--;
            System.out.println("num still" + Thread.currentThread().getName() + " " + num);
        }
    }
}

public class test {

    public static void main(String[] args) {
        Integer[] intlist = {12, 35, 6, 4, 3, 3, 65, 35};
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(intlist));
        System.out.print(linkedList.pop());
        linkedList.push(10);
        for (Integer i: linkedList){
            System.out.println(i);
        }
        int j = 0;
        for (;j<10;j++){
            if (j<5)
                System.out.println(j);
            else
                break;
        }
        System.out.println(j);
    }
}