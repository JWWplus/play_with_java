/**
 * Created by jiangweiwei on 17-8-9.
 * 输出每一层的值，从左到右
 */
import java.util.Queue;
import java.util.LinkedList;

public class printbinarytree {
    public static void main(String[] args){

    }

    public void printtree(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null)
            return;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val + "   ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

}
