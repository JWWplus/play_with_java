import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
/**
 * Created by jiangweiwei on 17-7-26.
 */
public class reOrderArray {
    public void OrderArray(int [] array) {
        LinkedList<Integer> quene1 = new LinkedList<Integer>();
        LinkedList<Integer> quene2 = new LinkedList<Integer>();
        for (int i: array){
            if (i%2 != 0){
                quene1.add(i);
            } else {
                quene2.add(i);
            }
        }
        int [] res = new int[array.length];

        for (int i=0; i< array.length; i++){
            if (quene1.peek() != null){
                res[i] = quene1.poll();
            }
            else {
                res[i] = quene2.poll();
            }
        }

        System.out.print(Arrays.toString(res));
    }

    public static void main(String[] args) {
        reOrderArray test = new reOrderArray();
        int [] array = {12,45,3,5,3,32,52,75,213,5,76};
        test.OrderArray(array);
    }
}
