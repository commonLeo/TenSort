package sort;

import java.util.Arrays;

public class HeapSort<T> extends Sort<T> {

    /**
     * 堆排序，即将数据构建成大顶堆或者小顶堆的形式进行排序，所谓大顶堆就是父节点永远大于子等于节点
     * 数据处理流程是：
     * 1、将无序数列构造为大顶堆，从最后一个非叶子节点开始计算，将大数据放到父节点。按照顺序依次到跟节点
     * 2、将堆顶元素与末尾元素交换，将最大元素沉到数组末端许，然后处理除了尾元素的剩余数据
     * 3、由于交换后，排除尾元素，剩余的元素还是保持大顶端的样子，所以只需要做一次从根节点开始到最后一个非叶子节点的大堆排序
     * 4、循环2-3步，直到没有剩余数据为止
     * @param list
     */
    @Override
    void sort(T[] list) {
        //1.构建大顶堆
        for(int i=list.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(list,i,list.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=list.length-1;j>0;j--){
            swap(list,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(list,0,j);//重新对堆进行调整
        }
    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param i
     * @param length
     */
    public void adjustHeap(T[] arr,int i,int length){
        T temp = arr[i];//先取出当前元素
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && less(arr[k], arr[k+1])){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(less(temp, arr[k])){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }
}
