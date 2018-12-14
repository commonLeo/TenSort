package sort;

import java.util.Arrays;

public class QuickSort<T> extends Sort<T> {

    /**
     * 快速排序是在元数据上进行操作
     * 快速排序同样采用分割法的形式对数据处理，其具体分析过程如下：
     * 1、任意选择一个位置，然后同时从左右两边开始与这个数据A比较
     * 2、比较过程中，先从左边找到大于这个数据A的数，然后从右边找到小于A的数，交换两者位置
     * 3、一直到两者相遇，将两者相遇的数与数据A交换
     * 4、这边就得到一个结果：A左边的数据都比A小，A右边的数据都比A大
     * 5、再对左边的数据做同样的动作，对右边的数据做同样的动作
     * 6、直到最后左右两边就剩一个数据
     * 时间复杂度： O（Nlog(N)）
     * 空间复杂度： O（log（N））
     * 由于要交换位置，后者会被先交换，所以快速排序不稳定
     *
     * 还有另外一种方法：
     * 原理一致，但是数据处理的时候，先将数据保存到临时变量tmp当中，left标记tmp所在位置，然后从右边开始找，找到数据之后A，放到left所在位置，
     * 然后从left开始找，找到数据B后，放到数据A原来的位置;如果还没有相遇，则又从右边找，找到了放到B原来所在位置，
     * 循环查找，直到最后相遇。将tmp变量放到相遇位置即可。不如前面一种看着简单
     * @param list
     */
    @Override
    void sort(T[] list) {
        sort(list, 0, list.length - 1);
    }

    public void sort(T[] a, int start, int end) {
        if(start >= end) return;
        int j = parition(a, start, end);
        //确定标记值的正确位置后，左边和右边递归处理
        sort(a, start, j - 1);
        sort(a, j + 1, end);
    }
    public int parition(T[] list, int start, int end) {
        int v = start, i = start, j = end + 1;
        while(true) {
            //从左边开始，直到找到一个数据不小于标记值
            while(less(list[++i], list[v])) if(i == end)break;
            //从右边开始，直到找到一个数据不大于标记值
            while(!less(list[--j], list[v])) if(j == start)break;
            //如果两者还没有相遇，则交换两个数据的位置，继续向中间检索
            if(i >= j) break;
            swap(list, i, j);
        }
        //找到右边第一个小于V的位置，交换目标值和小于他的数据的位置
        swap(list, v, j);
        return j;
    }

}
