package sort;

import java.util.Arrays;

public class BasedSort<T> extends Sort<T> {

    /**
     * 基数排序是计数排序的进阶版。从个位到高位的方式，排序数据。每轮位数上采用的就是计数排序，看最大数是几位数，然后循环几次
     * 基数排序基于计数排序
     * 举例：{12, 130, 345,234, 234, 235, 335, 203, 346, 34530,345,6436,2345,1235,4532};
     * 第一轮：[130, 34530, 12, 4532, 203, 234, 234, 345, 235, 335, 345, 2345, 1235, 346, 6436] 个位数0-9,这样从低位开始保证相同数位时，个位大的放到最后
     * 第二轮：[203, 12, 130, 34530, 4532, 234, 234, 235, 335, 1235, 6436, 345, 345, 2345, 346]
     * 第三轮：[12, 130, 203, 234, 234, 235, 1235, 335, 345, 345, 2345, 346, 6436, 34530, 4532]
     * 第四轮：[12, 130, 203, 234, 234, 235, 335, 345, 345, 346, 1235, 2345, 34530, 4532, 6436]
     * 第五轮：[12, 130, 203, 234, 234, 235, 335, 345, 345, 346, 1235, 2345, 4532, 6436, 34530]
     *
     * @param list
     */
    @Override
    void sort(T[] list) {

    }

    public static int[] sort(int [] a, int d) {
        int len = a.length;
        int[] res = new int[len];
        int[] count = new int[10];
        for(int i = 0, rate = 1; i < d; i ++) {
            Arrays.fill(count, 0);
            System.arraycopy(a, 0, res, 0, len);
            for(int j = 0; j < len; j ++) {
                count[(res[j]/rate) % 10] ++;
            }
            for(int j = 1; j < 10; j ++) {
                count[j] += count[j - 1];
            }
            for(int j = len - 1; j >= 0; j --) {
                a[--count[(res[j]/rate) % 10]] = res[j];
            }
            rate *= 10;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {12, 130, 345,234, 234, 235, 335, 203, 346, 34530,345,6436,2345,1235,4532};
        System.out.println("排序前的数组： " + Arrays.toString(a));
        int[] res = sort(a, 5);

        System.out.println("排序后的数组： " + Arrays.toString(res));
    }
}
