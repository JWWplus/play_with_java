/**
 * author: jiangweiwei
 */
public class sort_algorithm {
    public static void main(String[] args) {
        int[] array = {35,2,42,5421,56,7225,72,261,3622,1572,786,908,65454,632};

        //insert_sort(array);
        select_sort(array);
    }


    /*
    * 第一层循环相当于循环的遍数
    * 第二层循环是单个数据需要比较的次数
    * i+j = array.length - 1
    * 遍历的时候是j在移动
    * */
    private static void bubble_sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i: array)
            System.out.print(i + "  ");
    }

    /**
     * 插入排序
     *
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将新元素插入到该位置中
     * 重复步骤2
     * @param array  待排序数组
     */
    private static void insert_sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > temp; j--)
                array[j + 1] = array[j];
            array[j+1] = temp;
        }

        for (int i: array) {
            System.out.print(i + "  ");
        }
    }

    private static void quick_sort(int[] array, int low, int high) {
        int l = low;
        int r = high;
        int temp = array[low];

        if (l < r) {
            while (l < r){
                while (l < r && temp < array[r])
                    r--;
                if (l < r)
                    array[l] = array[r];

                while (l < r && temp >= array[l])
                    l++;
                if (l < r)
                    array[r] = array[l];
            }
            array[l] = temp;
            quick_sort(array, low, l-1);
            quick_sort(array, l+1, high);
        }
    }

    /**
     * 选择排序算法
     * 在未排序序列中找到最小元素，存放到排序序列的起始位置
     * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
     * 以此类推，直到所有元素均排序完毕。
     * @param array
     */
    private static void select_sort(int[] array) {
        int size = array.length;
        int temp = 0;

        for(int i = 0; i < size; i++) {
            int index = i;

            for (int j = size - 1; j > i; j--) {
                if (array[j] < array[index])
                    index = j;
            }
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        for (int i: array) {
            System.out.print(i + "  ");
        }
    }
}
