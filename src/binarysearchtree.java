/**
 * Created by jiangweiwei on 17-8-9.
    判断二叉搜索树的输出   是不是一个树的输出
 */

public class binarysearchtree {
    public boolean find(int[] array, int start, int end){
        //当只有一个数值时跳出
        if (array == null || array.length < 2)
            return true;

        int root = array[end];
        int i = start;
        // 寻找左子节点
        for (; i < end; i++){
            if (array[i] > root)
                break;
        }
        // 寻找右子节点
        int j = i;
        for (; j < end; j++){
            // 在右子节点看到有小于根节点的直接返回false
            if (array[j] < root)
                return false;
        }

        //递归看  左右子节点的情况
        boolean left = true;
        if (i > start)
            left = find(array, start, i-1);
        boolean right = true;
        if (j < end)
            right = find(array, i, end - i);
        return left && right;
    }

    public static void main(String[] args){
        int[] test = {4,8,6,12,16,14,10};
        binarysearchtree t = new binarysearchtree();
        t.find(test, 0, test.length-1);

    }
}
