package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort<T> extends Sort<T> {

    /**
     * 归并排序是将数据采用二分法，进行多次二分，保证局部有序的方式来保证需要合并的数据满足合并的条件
     * 将数组按照二分策略进行递归
     * 将其进行合并，分配一个新的并且和原始数组相同大小的数组
     * 将新的数组分成一半，进行比较，小的将其依次放入原始的数组
     * 递归结束后，原始的数组也就排好序了
     * 时间复杂度： O(Nlog(N))
     * 空间复杂度： O(log(N)) ~O(N)
     * @param list
     */
    T[] tmp;
    @Override
    void sort(T[] list) {
        int length = list.length;
        tmp = (T[]) Array.newInstance(list[0].getClass(), length);
        sort(list, 0, length-1);
        list = tmp;
    }

    public void sort(T[] list, int start , int end){
        if(start >= end)
            return;
        int middle = start + (end -start)/2;
        sort(list, start, middle);
        sort(list, middle+1, end);
        subMerge(list, start, middle, end);
    }

    public  void subMerge(T[] list, int start, int middle, int end){
        System.arraycopy(list, start, tmp, start, end - start + 1 );
        int i = start, j = middle + 1;
        for(int k = start; k <= end; k++){
            if(i > middle){
                list[k] = tmp[j++];
            }else if(j > end){
                list[k] = tmp[i++];
            }else if(less(tmp[i], tmp[j])){
                list[k] = tmp[i++];
            }else{
                list[k] = tmp[j++];
            }
        }
    }
}
