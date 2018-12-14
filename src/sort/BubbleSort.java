package sort;

import java.util.Comparator;

public class BubbleSort<T> extends Sort<T> {

    /**
     * 使用冒泡排序，对数据进行排序，要求数据支持Comparable接口
     * 冒泡排序就是使用冒泡的原理，将最大的数据依次向后传递，采用两轮循环，外循环控制参与冒泡的数据，内循环进行冒泡。比如数据 2,-1,3,1
     * 第一轮参加循环的数据有: 2,-1,3,1   结果为:-1,2,1,3  从第一位开始冒泡
     * 第二轮参加循环的数据有: -1,2,1  结果为-1,1,2
     * 第三轮参加循环的数据有:-1, 1  结果为 -1,1
     * 第此次参加循环的数据有:-1  结果为-1
     * 时间复杂度：O(N^2)~O(N)
     * 空间复杂度：O(N^2)
     * @param list
     */
    @Override
    public void sort(T[] list) {
        int length = list.length;
        for (int i = length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(!less(list[j], list[j+1])){
                    swap(list, j , j+1);
                }
            }
        }
    }


}
