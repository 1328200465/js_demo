import java.util.Comparator;

public class demo9_Comparator implements Comparator<FdccAdmin> {
    public static void main(String[] args) {
        demo9_Comparator demo9 = new demo9_Comparator();
        FdccAdmin obj1 = new FdccAdmin();
        FdccAdmin obj2 = new FdccAdmin();
        obj1.age = 100;
        obj2.age = 2;


        System.out.println(demo9.compare(obj1, obj2));
    }

    @Override
    public int compare(FdccAdmin obj1, FdccAdmin obj2) {
        return obj1.age > obj2.age ? 1 : 0;
    }
}