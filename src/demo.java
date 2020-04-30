import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Arrays;

public class demo {

    public static String trans() {
        String origin = "main-action-holder";
        String[] splited = origin.split("-");
        String newRes = "";
        for (int i = 0; i < splited.length; i++) {
            String res = splited[i].substring(0, 1).toUpperCase();
            String res1 = splited[i].substring(1);
            if (i == 0)
                newRes += res + res1;
            else
                newRes += res + res1;
        }
        return newRes;
    }

    public static void wo() {
        String origin = "main-action-holder";
        String[] splited = origin.split("-");
//       splited.toString().toUpperCase();
        Arrays.sort(splited);
        for (String n : splited)
            System.out.print(n + ",");

    }


    public static void main(String[] args) throws IOException {
        demo d = new demo();
        System.out.println(d.trans());
        d.wo();
        System.out.println(StringUtils.capitalize("Ddf"));
    }
}