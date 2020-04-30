import java.util.Arrays;


public class demo5 {
    int[] arr = {65, 5341, 41856561, 1563, 315, 56, 15, 12,};

    public static void BubbleSort(int[] arr) {
        int temp;//临时变量
        boolean flag;//是否交换的标志
        for (int i = 0; i < arr.length - 1; i++) {   //表示趟数，一共arr.length-1次。
            flag = false;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
//                System.out.print(arr[i]);
            }
            System.out.println(arr[i]);
//            if (!flag) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {65, 5341, 41856561, 1563, 315, 56, 15, 12,};
        demo5 demo4 = new demo5();
        demo5.BubbleSort(arr);
        Arrays.toString(arr);
        for (int n : arr)
            System.out.print(n + ",!");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",#");
        }
        ;

        System.out.print(Arrays.asList(arr));

    }

}

