import java.util.Stack;

/**
 * Created by jiangweiwei on 17-8-7.
 */
public class PushPopOrder {
    public boolean check(int[] push, int[] pop){
        boolean ispossible = false;
        if (push != null && pop != null){
            Stack<Integer> stack = new Stack<Integer>();
            int i = 0, j = 0;
            while (j < pop.length){
                while (i < push.length && pop[j] != push[i]){
                    stack.push(push[i]);
                    i++;
                }
                j++;
                i++;
                int top =0;
                while ((!stack.isEmpty()) && (top = stack.pop()) == pop[j]){
                    j++;
                }
                if (j < pop.length){
                    stack.push(top);
                }
                if (!stack.isEmpty() && i >= push.length){
                    break;
                }
            }
            if (stack.isEmpty()){
                ispossible = true;
            }
        }
        return ispossible;
    }

    public static void main(String[] args){

    }
}
