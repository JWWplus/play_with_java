/**
 * Created by jiangweiwei on 17-8-1.
 */
import java.util.HashMap;

public class shunxu {
    public static int k = 0;
    public static shunxu t1 = new shunxu("t1");
    public static shunxu t2 = new shunxu("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");

    {
        print("构造块");
    }
    static {
        print("静态块");
    }

    public shunxu(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++i;
        ++n;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++n;
        return ++i;
    }

    public static void main(String args[]) {
        shunxu t = new shunxu("init");
    }
}
