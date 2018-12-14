package sort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort<T extends Comparable<? super T>> extends Sort<T> {

    /**
     * 桶排序就是将一批数据，按照相关的要求，分到不同的桶里。其实在分配桶的过程中，就实现了初步区分，其通过将数据与基础数据的差异大小进行放置
     * 桶的个数越多，桶内数据越小
     * 后续再在桶中进行排序
     * 时间复杂度：O（N）
     * 空间复杂度：O（N）
     * @param list 待排序的列表
     */
    @Override
    public void sort(T[] list) {
        int len = list.length;
        T max = list[0];
        T min = list[0];
        for(int i = 0; i < len; i ++) {
            Comparable<? super T> k = (Comparable<? super T>) list[i];
            min = k.compareTo(min) > 0 ? min:(T)k;
            max = k.compareTo(max) > 0 ? (T)k:max;
        }
        //Work out bucket's size
        Comparable<? super T> comparableMax = (Comparable<? super T>) max;
        int bucketNum = comparableMax.compareTo(min)/len + 1;
        ArrayList<ArrayList<T>> bucketArr = new ArrayList<>();
        //initial every bucket
        for(int i = 0; i < bucketNum; i ++) {
            bucketArr.add(new ArrayList<T>());
        }
        //nums of Arrays is gived corresponding bucket
        for(int i = 0; i < len; i ++) {
            Comparable<? super T> k = (Comparable<? super T>) list[i];
            int num = k.compareTo(min) /len;
            bucketArr.get(num).add(list[i]);
        }
        //The number of  sorted within every bucket
        for(int i = 0; i < bucketArr.size(); i ++) {
            Collections.sort(bucketArr.get(i));
        }
        //trans to list
        int index = 0;
        for(int i = 0; i < bucketArr.size(); i ++) {
            Object[] objects = bucketArr.get(i).toArray();
            System.arraycopy(objects, 0, list, index, objects.length);
            index += objects.length;
        }
    }
}
