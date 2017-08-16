import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by jiangweiwei on 17-8-14.
 * 在二叉树中寻找和为某值的路径
 */
public class findrouteintree {

    public void findpath(TreeNode tree, int k){
        if (tree == null)
            return;
        Stack<Integer> stack = new Stack<>();
        findpath(tree, k, stack);

    }

    public void findpath(TreeNode root, int k, Stack<Integer> path){
        if (root == null)
            return;
        if ((root.left == null) && (root.right == null)){
            if (root.val == k){
                for (Integer i: path)
                    System.out.print(i + " ");
                System.out.print(root.val);
            }
        }
        else {
            path.push(root.val);
            findpath(root.left, k - root.val, path);
            findpath(root.right, k - root.val, path);
            path.pop();
        }
    }

    public static void main(String[] args){

    }
}
