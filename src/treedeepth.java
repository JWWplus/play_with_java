/**
 * Created by jiangweiwei on 17-8-8.
 * 求二叉树的深度
 */

public class treedeepth {
    public static void main (String[] args) {

    }

    // 求二叉树的深度
    public int treedeep(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = treedeep(root.left);
        int right = treedeep(root.right);

        return (left > right) ? (left + 1): (right + 1);
    }

    // 求二叉树是不是平衡树(左右子树深度相差不超过1的就是平衡树)

    public boolean isbalancetree(TreeNode root) {
        boolean isbaltree = false;
        if (root == null) {
            return true;
        }

        int left = treedeep(root.left);
        int right = treedeep(root.right);
        if (left - right > 1 || left - right < -1){
            return false;
        }
        return isbalancetree(root.left) && isbalancetree(root.right);
    }
}
