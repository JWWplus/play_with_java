/**
 * Created by jiangweiwei on 17-8-11.
 * 思路：
 动态规划解决
 定义数组dp[]
 dp[i] 表示走到 i 位置需要的最短步数

 在计算的时候，由于我们知道i位置的可以向前走的距离
 当 i 位置可以走的时候，计算走到 i + x 位置时候的 最小步数

 计算当前K的公约数
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class tiaoshiban {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int m;
//        while(in.hasNext()){
//            n = in.nextInt();
//            m = in.nextInt();
//            System.out.println(solveDP(n,m));
//        }
        System.out.println(solveDP(4, 24));

    }
    private static int solveDP(int n,int m){
        int[] dp = new int[m+1]; // 到达 i位置需要的最小步数
        if(m==n)
            return 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
//        System.out.println(Arrays.toString(dp));
        dp[n] = 0;
        for(int i=n;i<=m;i++){
            if(dp[i] == Integer.MAX_VALUE){ // 该位置不能到达
                dp[i] = 0;
                continue;
            }
            ArrayList<Integer> gcd = getList(i);
            for(int j=0;j<gcd.size();j++){
                int x = gcd.get(j);
                if(i+x<=m) // 记录向前走的长度，保留最小的步数
                    dp[i+x] = Math.min(dp[i+x], dp[i] + 1);
            }
        }
        if(dp[m]==0)
            return -1;
        else
            return dp[m];

    }
    // 求因数 时间复杂度 sqrt（n） 很强大
    public static ArrayList<Integer> getList(int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2;i*i<=k;i++){
            if(k%i ==0){
                if(i!=1&&i!=k)
                    list.add(i);
                if((i*i)!=k&&(k/i)!=1&&(k/i)!=k)
                    list.add(k/i);
            }
        }
        return list;
    }
}