/**
 * Created by jiangweiwei on 17-8-8.
 * 二叉树后序遍历
 */
import java.util.Stack;

class Node {
    public int data; //树结点标号
    public Node lchild; //左子树
    public Node rchild;  //右子树

    public Node getLchild(){
        return lchild;
    }

    public Node getRchild(){
        return rchild;
    }
}
public class postorder {
    public static void main(String[] args){

    }

    public void postOrder(Node node){
        if(node==null)
            return;
        Stack<Node> s = new Stack<Node>();

        Node curNode; //当前访问的结点
        Node lastVisitNode; //上次访问的结点
        curNode = node;
        lastVisitNode = null;

        //把currentNode移到左子树的最下边
        while(curNode!=null){
            s.push(curNode);
            curNode = curNode.getLchild();
        }
        while(!s.empty()){
            curNode = s.pop();  //弹出栈顶元素
            //一个根节点被访问的前提是：无右子树或右子树已被访问过, 因为下面要再次入栈
            if(curNode.getRchild()!=null&&curNode.getRchild()!=lastVisitNode){
                //根节点再次入栈
                s.push(curNode);
                //进入右子树，且可肯定右子树一定不为空
                curNode = curNode.getRchild();
                while(curNode!=null){
                    //再走到右子树的最左边
                    s.push(curNode);
                    curNode = curNode.getLchild();
                }
            }else{
                //访问
                System.out.println(curNode.data);
                //修改最近被访问的节点
                lastVisitNode = curNode;
            }
        } //while
    }
}
