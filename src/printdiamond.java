/**
 * Created by jiangweiwei on 17-8-5.
 */

public class printdiamond {

    public static void main(String[] args) {
        int n = 8;
        for (int i = -n / 2; i <= n / 2; i++) {
            for (int j = 0; j < (i > 0 ? i : -i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i > 0 ? -2 * i + n : 2 * i + n); j++) {
                if (j == 0 || j == (i > 0 ? -2 * i + n : 2 * i + n) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        //前10行.上半部分
        for (int i = 1; i <= n; i++)//控制行数
        {
            for (int k = n - 1; k >= i; k--)//打印空格
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)//打印*
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //后9行,下半部分
        for (int i = n - 1; i >= 1; i--) {
            for (int k = i; k <= n - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
