package sort;

public class SelectSort<T> extends Sort<T> {

    /**
     * 选择排序，每次从剩余的数据中，获取最小数据的位置，并与指定位置交换数据
     * 时间复杂度:O(N^2)
     * @param list
     */
    @Override
    void sort(T[] list) {
        for (int i = 0; i < list.length; i++) {
            int min_index = i;
            for (int j = i+1; j < list.length; j++) {
                if(!less(list[min_index],list[j])){
                    min_index = j;
                }
            }
            swap(list, i, min_index);
        }
    }
}
