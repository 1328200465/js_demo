import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class demo1 {

    public static void main(String[] args) throws IOException {
        demo1 d = new demo1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("请输入投掷次数：");
        str = br.readLine();
        Integer times = Integer.parseInt(str);
        ArrayList<Integer> resList = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            Integer res = d.oneRound();
            System.out.println("第" + i + "次结果：" + res);
            resList.add(res);
        }
        //计算概率
        for (Integer val : resList) {
            System.out.println(val + "出现的概率为" + d.getRate(val, resList));
        }
    }

    public Integer roll() {
        Random rnd = new Random();
        Integer res = rnd.nextInt(6) + 1;
        return res;
    }

    public Integer oneRound() {
        return roll() + roll();
    }

    public double getRate(Integer value, ArrayList<Integer> results) {
        Double times = 0.0;
        Integer size = results.size();
        for (Integer val : results) {
            if (val == value)
                times++;
        }

        double res = times / size;
        res = (double) Math.round(res * 100) / 100;
        return res;
    }
}
