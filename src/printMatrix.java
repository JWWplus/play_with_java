/**
 * Created by jiangweiwei on 17-8-5.
 * 顺时针打印矩阵
 */
import java.util.ArrayList;

public class printMatrix {
    public ArrayList<Integer> matrix = new ArrayList<Integer>();
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printMatrix mat = new printMatrix();
        mat.printMatrixcrile(arr);
    }

    public void printMatrixcrile(int[][] array){
        if (array == null){
            return;
        }
        int start = 0;
        while (array[0].length > start*2 && array.length > start*2){
            printOneCircle(array, start);
            start++;
        }
        System.out.print(matrix.toString());
    }

    public void printOneCircle(int[][] array, int start){
        int col = array[0].length;
        int row = array.length;
        int endx = col - 1 - start;
        int endy = row - 1 - start;

        //打印第一行  左->右
        for (int i=start; i<=endx; i++)
            matrix.add(array[start][i]);
        //打印 上->下
        if (endy > start){
            for (int i=start+1; i<=endy; i++)
                matrix.add(array[i][endx]);
        }
        if (endx > start && endy > start){
            for (int i=endx -1; i >= start; i--)
                matrix.add(array[endy][i]);
        }
        if (start < endy -1 && endx > start){
            for (int i=endy - 1; i>= start+1; i--)
                matrix.add(array[i][start]);
        }
    }
}
