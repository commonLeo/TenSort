package sort;

import com.sun.scenario.effect.Merge;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.quick3Test();
    }

    public void quick3Test(){
        Quick3Sort<Integer> bubbleSort = new Quick3Sort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        Quick3Sort<People> bubbleSort2 = new Quick3Sort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void quickTest(){
        QuickSort<Integer> bubbleSort = new QuickSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        QuickSort<People> bubbleSort2 = new QuickSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void mergeTest(){
        MergeSort<Integer> bubbleSort = new MergeSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
//        Integer[] list = new Integer[]{100, 1, 30, 30, 50};
        bubbleSort.sort(list);
        dump(list);

        MergeSort<People> bubbleSort2 = new MergeSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void HeapTest(){
        HeapSort<Integer> bubbleSort = new HeapSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        HeapSort<People> bubbleSort2 = new HeapSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void selectTest(){
        SelectSort<Integer> bubbleSort = new SelectSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        SelectSort<People> bubbleSort2 = new SelectSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void shellTest(){
        ShellSort<Integer> bubbleSort = new ShellSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        ShellSort<People> bubbleSort2 = new ShellSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void insertTest(){
        InsertSort<Integer> bubbleSort = new InsertSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        InsertSort<People> bubbleSort2 = new InsertSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void bucketTest(){
        BucketSort<Integer> bubbleSort = new BucketSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        BucketSort<People> bubbleSort2 = new BucketSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void bubbleTest(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
        Integer[] list = new Integer[]{-1, 2, -3 , 5, 2, 9, -2};
        bubbleSort.sort(list);
        dump(list);

        BucketSort<People> bubbleSort2 = new BucketSort<People>();
        People[] list2 = new People[5];
        list2[0] = new People("xiaowang", 100);
        list2[1] = new People("xiaoshuyao", 1);
        list2[2] = new People("xiaosongge", 30);
        list2[3] = new People("zhangxiaobao", 30);
        list2[4] = new People("xiaoxxx", 50);
        bubbleSort2.sort(list2);
        dump(list2);
    }

    public void dump(Object[] list){
        for(Object object : list){
            System.out.println(object.toString());
        }
    }
}
