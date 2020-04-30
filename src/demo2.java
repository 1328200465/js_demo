import java.util.ArrayList;
import java.util.Random;

public class demo2 {

    public static void main(String[] args) {
        demo2 a = new demo2();

        System.out.println(a.roll());
        System.out.println(a);
        System.out.println(a.oneRound());
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
