import sun.reflect.generics.tree.Tree;

/**
 * Created by jiangweiwei on 17-8-3.
 */
public class hassubtree {
    public static void main(String[] args){

    }

    public boolean hastree(TreeNode t1, TreeNode t2){
        if (t2 == null){
            return true;
        }
        if (t1 == null){
            return false;
        }

        boolean result = false;
        if ((t1 != null) && (t2 != null)){
            if (t1.val == t2.val){
                result = findsubtree(t1, t2);
            }
            if (!result){
                result = hastree(t1.left, t2);
            }
            if (!result){
                result = hastree(t1.right, t2);
            }
        }
        return result;
    }

    public boolean findsubtree(TreeNode t1, TreeNode t2){
        if (t2 == null){
            return true;
        }
        if (t1 == null){
            return false;
        }
        if (t1.val != t2.val){
            return false;
        }
        return findsubtree(t1.left, t2.left) && findsubtree(t1.right, t2.right);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}