package sort;

public class ShellSort<T> extends Sort<T> {

    /**
     *希尔排序也成为“缩小增量排序”，
     * 其基本原理是，现将待排序的数组元素分成多个子序列，使得每个子序列的元素个数相对较少，然后对各个子序列分别进行直接插入排序，
     * 待整个待排序列“基本有序”后，最后在对所有元素进行一次直接插入排序。
     * 因此，我们要采用跳跃分割的策略：将相距某个“增量”的记录组成一个子序列，这样才能保证在子序列内分别进行直接插入排序后得到的结果是基本有序而不是局部有序。
     * 希尔排序是对直接插入排序算法的优化和升级。
     *希尔排序不是稳定的排序
     * 希尔排序最好时间复杂度和平均时间复杂度都是O(Nlog(N))，最坏时间复杂度为O（N^2）
     * @param list
     */
    @Override
    public void sort(T[] list) {
        //对各个子序列进行交换发
//        for (int gap = list.length/2; gap > 0; gap/=2) {
//            for (int i = gap; i < list.length; i++) {
//                int j = i;
//                while(j-gap >= 0 && less(list[j], list[j-gap])){
//                    swap(list, j, j-gap);
//                    j-= gap;
//                }
//            }
//        }
        //对各个子序列采用插入法
        for (int gap = list.length/2; gap > 0; gap/=2) {
            for (int i = gap; i < list.length; i++) {
                int j = i;
                T temp = list[j];
                if(less(list[j], list[j-gap])){
                    while(j-gap >= 0 && less(temp,list[j-gap])){
                        list[j] = list[j-gap];
                        j-= gap;
                    }
                    list[j] = temp;
                }

            }
        }
    }
}
