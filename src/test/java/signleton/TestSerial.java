package signleton;

import com.stalern.designpattern.singleton.hungry.EnumInstance;
import com.stalern.designpattern.singleton.hungry.HungrySingleton;

import java.io.*;

/**
 * 序列化和反序列化来破坏单例模式
 * @author stalern
 * @date 2019/10/2--14:41
 */
public class TestSerial {
    public static void main(String[] args) throws Exception {
//         testHungry();
        testEnum();
    }
    private static void testHungry() throws Exception{
        HungrySingleton instance = HungrySingleton.getHungry();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file_name"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file_name"));
        HungrySingleton otherInstance = (HungrySingleton)ois.readObject();

        System.out.println(instance);
        System.out.println(otherInstance);
        System.out.println(instance == otherInstance);
    }

    private static void testEnum() throws Exception {
        EnumInstance rawInstance = EnumInstance.getInstance();
        rawInstance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file_name"));
        oos.writeObject(rawInstance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file_name"));
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(rawInstance.getData());
        System.out.println(newInstance.getData());
        System.out.println(rawInstance.getData() == newInstance.getData());
    }
}
