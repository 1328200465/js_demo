public class recursion {
    public static int fib(int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static int fib1(int num) {
        if (num <= 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return num * fib1(num - 1);
    }

    public static void main(String[] args) throws Exception {
        int num1 = 0;
        int num2 = 1;
        int numn = 1;
        long startTime = System.currentTimeMillis();

        for (int i = 3; i <= 30; i++) {
            numn = num1 + num2;
            num1 = num2;
            num2 = numn;
        }
        System.out.println(numn);
        long endTime = System.currentTimeMillis();
        System.out.println("循环用时：" + (endTime - startTime));

        long startTime1 = System.currentTimeMillis();
        System.out.println(fib(30));
        long endTime1 = System.currentTimeMillis();
        System.out.println("递归用时：" + (endTime1 - startTime1));
        System.out.println(fib1(6));

    }
}
