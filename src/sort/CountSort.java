package sort;

import java.util.Arrays;

public class CountSort<T> extends Sort<T> {

    /**
     * 计数排序，计数排序属于一种特别的排序方式，他牺牲空间的方式来完成数据的排序。
     * 通过数据的最大值，生成数据最大值长度的数组，然后将数据的值作为数据的下标索引，值为该值出现的次数。
     * 然后对数组进行处理，将数组的值修改为其前面的数据的和，这样就相当于统计了该数据出现在这个序列的多少位
     * 最后对原数据取值x，获取以他为索引的数据的大小y，放置到一个新的数组中，其中y-1为索引，x为值
     * 时间复杂度：Ο(n+k)（其中k是整数的范围
     * 这是一种牺牲空间换取时间的做法，而且当O(k)>O(n*log(n))的时候其效率反而不如基于比较的排序（基于比较的排序的时间复杂度在理论上的下限是O(n*log(n)), 如归并排序，堆排序）
     * @param list
     * 此数据由于无法获取其值，将其转化为数组的下标，所以不能用范型来实现，例子见main函数
     */
    @Override
    void sort(T[] list) {

    }

    public static int[] sort(int[] a, int k) {
        int len = a.length;
        int[] res = new int[len];
        int[] count = new int[k];
        for(int i = 0; i < len; i ++) {
            count[a[i]] ++;
        }
        for(int i = 1; i < k; i ++) {
            count[i] += count[i-1];
        }
        for(int i = len - 1; i >= 0; i --) {
            res[--count[a[i]]] = a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 4, 3, 1, 6, 4, 5};
        System.out.println("排序前的数组：" + Arrays.toString(a));
        int[] res = sort(a, 7);
        System.out.println("排序后的数组：" + Arrays.toString(res));
    }
}
