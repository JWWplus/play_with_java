/**
 * Created by jiangweiwei on 17-7-18.
 * 重建二叉树
 */
public class rebuild_tree {
    private binarytreenode recontructbinarytree(int[] pre, int[] in) {
        binarytreenode root = recontructbinarytree(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;
    }

    public binarytreenode recontructbinarytree(int[] pre, int start_pre, int end_pre, int[] in, int in_start, int end_in) {
        if (start_pre > end_pre || in_start > end_in) {
            return null;
        }
        binarytreenode root = new binarytreenode(pre[start_pre]);

        for(int i=in_start; i<end_in; i++){
            if (pre[start_pre] == in[i]){
                root.left = recontructbinarytree(pre, start_pre+1, start_pre+i-in_start, in, in_start, i-1);
                root.right = recontructbinarytree(pre, end_pre+i-end_in+1, end_pre, in, i+1, end_in);
            }
        }
        return root;
    }
}

class binarytreenode {
    public int value;
    public binarytreenode left;
    public binarytreenode right;

    public binarytreenode() {

    }

    public binarytreenode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}