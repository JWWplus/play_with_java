/**
 * Created by jiangweiwei on 17-8-3.
 */
public class mirrorTree {
    public void mirror(TreeNode1 tree){
        if (tree == null){
            return;
        }
        if (tree.left == null && tree.right == null){
            return;
        }
        TreeNode1 temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;

        if (tree.left != null){
            mirror(tree.left);
        }
        if (tree.right != null){
            mirror(tree.right);
        }

    }
}

class TreeNode1 {
    int val = 0;
    TreeNode1 left = null;
    TreeNode1 right = null;

    public TreeNode1(int val) {
        this.val = val;

    }

}