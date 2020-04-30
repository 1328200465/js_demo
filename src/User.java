import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {

    private String user;
    private int age;

    public User() {
//        System.out.println("user constructor.");
    }

    public User(String user, int age) {
//        System.out.println("user constructor two.");
        this.user = user;
        this.age = age;
    }

    //    // Externalizable的序列化对象
//    public static void writeExternalizableObject() {
//        User user = new User("huhx", 22);
//        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Externalizable.txt"));
//            objectOutputStream.writeObject(user);
//            objectOutputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    // Externalizable的反序列化对象
//    public static void readExternalizableObject() {
//        try {
//            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Externalizable.txt"));
//            User user = (User) objectInputStream.readObject();
//            objectInputStream.close();
//            System.out.println("name: " + user.getUser() + ", age: " + user.getAge());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {

//        writeExternalizableObject();
//        readExternalizableObject();
    }

    public String getUser() {
        return user;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("read external.");
        user = (String) in.readObject();
        age = in.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("write external.");
        out.writeObject(user);
        out.writeInt(age);
    }
}