//public class demo7{
//    public static void main(String[] args) {
//        int[] arr = {11, 22, 33, 44, 55};
//        System.out.println("1位置: " + arr);
////        printArray(arr);  // 数组作为方法参数传递，传递的参数是数组内存的地址
//    }
//    public void bubbleSort(int array[]) {
//        int[] array = {11, 22, 33, 44, 55};
//        int t = 0;
//        for (int i = 0; i < array.length - 1; i++)
//            for (int j = 0; j < array.length - 1 - i; j++)
//                if (array[j] > array[j + 1]) {
//                    t = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = t;
//                }
//    }
//    public void selectSort(int array[]) {
//        int t = 0;
//        for (int i = 0; i < array.length - 1; i++){
//            int index=i;
//            for (int j = i + 1; j < array.length; j++)
//                if (array[index] > array[j])
//                    index=j;
//            if(index!=i){ //找到了比array[i]小的则与array[i]交换位置
//                t = array[i];
//                array[i] = array[index];
//                array[index] = t;
//            }
//        }
//    }
//    public void insertionSort(int array[]) {
//        int i, j, t = 0;
//        for (i = 1; i < array.length; i++) {
//            if(a[i]<a[i-1]){
//                t = array[i];
//                for (j = i - 1; j >= 0 && t < array[j]; j--)
//                    array[j + 1] = array[j];
//                //插入array[i]
//                array[j + 1] = t;
//            }
//        }
//    }
//    public void quickSort(int array[], int low, int high) {// 传入low=0，high=array.length-1;
//        int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
//        if (low < high) {
//            p_pos = low;
//            pivot = array[p_pos];
//            for (i = low + 1; i <= high; i++)
//                if (array[i] > pivot) {
//                    p_pos++;
//                    t = array[p_pos];
//                    array[p_pos] = array[i];
//                    array[i] = t;
//                }
//            t = array[low];
//            array[low] = array[p_pos];
//            array[p_pos] = t;
//            // 分而治之
//            quickSort(array, low, p_pos - 1);// 排序左半部分
//            quickSort(array, p_pos + 1, high);// 排序右半部分
//        }
//
//
//    public static void printArray(int[] arr) {
//        System.out.println("2位置: " + arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
//    }
//}