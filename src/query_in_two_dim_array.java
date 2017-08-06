/**
 * Created by jiangweiwei on 17-7-16.
 * 在二维数组中query
 */
public class query_in_two_dim_array {
    public boolean Find(int target, int [][] array) {
        boolean found = false;
        int len  = 0;
        int i = array[0].length - 1;
        while ((i >= 0) && (len < array.length)){
            if (array[len][i] == target){
                found = true;
                break;
            }
            else if (array[len][i] > target){
                i--;
            }
            else if (array[len][i] < target){
                len++;
            }
        }
        return found;
    }
}
