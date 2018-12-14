package sort;

public class InsertSort<T> extends Sort<T> {

    /**
     * 插入排序通过多次将数据插入排好序的序列中得名而来
     * 每次取出一个数据，从拍好序的序列右侧开始比较，如果序列中的数据大于取出的数据，则将数据往后移动，将取出的数据放入移动数据的位置。
     * 然后在与之前的数据比较，交换位置。直到数据不小于前一个数据
     * 时间复杂度： O（N^2）
     * 空间复杂度： O（N^2）
     * @param list
     */
    @Override
    public void sort(T[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if(less(list[j], list[j-1])){
                    swap(list, j , j-1);
                }else{//当发现钱一个数据小于后一个数据时，停止比较，因为前面的数据都是有序的，没有继续比较的意义
                    break;
                }
            }
        }

    }

}
