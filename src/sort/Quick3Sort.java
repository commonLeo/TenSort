package sort;

import java.util.Arrays;

public class Quick3Sort<T> extends Sort<T> {

    /**
     * 三路排序是基于快速排序的基础上，不过其将数据划分为3部分，分别为小于、等于、大于。下一轮排序时，仅对小于、大于的进行排序即可
     * @param list
     */
    @Override
    void sort(T[] list) {
        sort(list, 0 ,list.length-1);
    }

    public void sort(T[] list, int start ,int end){
        if(start >= end) return;
        T tmp = list[start];
        int i = start +1, gt = end, lt = start;
        while( i<= gt){
            int cmp = compareTo(list[i],tmp);
            if(cmp < 0){
                swap(list, i++, lt++);
            }else if(cmp > 0){
                swap(list, i, gt--);
            }else{
                i++;
            }
        }
        sort(list, start, lt-1);
        sort(list, gt+1, end);
    }

    public int compareTo(T x , T y){
        Comparable<? super T> k = (Comparable<? super T>) x;
        return k.compareTo(y);
    }

}
