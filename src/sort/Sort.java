package sort;

abstract class Sort<T> {
    abstract  void sort(T[] list);

    /**
     * 比较数据大小，小为true，大为false
     * @param x
     * @param y
     * @return true or false
     */
    public boolean less(T x , T y){
        Comparable<? super T> k = (Comparable<? super T>) x;
        return k.compareTo(y) < 0 ? true:false;
    }

    /**
     * 交换数组中两个位置的数据
     * @param list
     * @param x
     * @param y
     */
    public void swap(T[] list, int x, int y){
        T tmp = list[x];
        list[x] = list[y];
        list[y] = tmp;
    }
}
