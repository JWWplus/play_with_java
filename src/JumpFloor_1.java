/**
 * Created by jiangweiwei on 17-7-20.
 * 斐波那契变形
 */

/*
* 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
* */
public class JumpFloor_1 {
    public int JumpFloor(int target) {
        int a = 1;
        int b = 2;
        int result;

        if (target <= 0) {
            return 0;
        } else if (target == 1) {
            return a;
        } else if (target == 2) {
            return b;
        } else {
            for (int i = 3; i <= target; i++) {
                result = b;
                b = a + b;
                a = result;
            }
            return b;
        }
    }
}

/*
*一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
* */

class JumpFloor_2 {
    public int JumpFloorII(int target) {
        int a = 1;
        if (target == 0 || target == 1){
            return a;
        } else {
            for (int i=2; i <= target; i++){
                a *= 2;
            }
            return a;
        }
    }
}

//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

class JumpFloor_3 {
    public int RectCover(int target) {
        int a = 1;
        int b = 2;
        int temp;
        if (target <= 0) {
            return 0;
        } else if (target == 1){
            return a;
        } else if (target == 2){
            return b;
        } else {
            for (int i = 3; i <= target; i++){
                temp = b;
                b = a + b;
                a = temp;
            }
            return b;
        }
    }
}