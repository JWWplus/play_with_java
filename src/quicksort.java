/**
 * Created by jiangweiwei on 17-8-4.
 */
public class quicksort{
    public static void main(String[] args){
        int [] n = {43,2,4,3,56,13,-3,5,10,74};
        int low = 0;
        int high = n.length - 1;
        _quicksort(n, low, high);
        for (int i: n){
            System.out.println(i);
        }
    }

    public static void _quicksort(int[] n, int low, int high){
        int temp = n[low];
        int l = low;
        int r = high;
        if(l < r){
            while (l < r){
                while (l < r && temp < n[r]){
                    r--;
                }
                if (l < r){
                    n[l] = n[r];
                }
                while (l < r && temp >= n[l])
                    l++;
                if (l < r){
                    n[r] = n[l];
                }
            }
            n[l] = temp;
            _quicksort(n, low, l -1);
            _quicksort(n, l + 1, high);
        }
    }

}