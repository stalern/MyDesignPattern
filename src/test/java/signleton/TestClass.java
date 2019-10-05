package signleton;

import com.stalern.singleton.hungry.EnumInstance;
import com.stalern.singleton.hungry.HungrySingleton;
import com.stalern.singleton.lazy.GirlFriend;

import java.lang.reflect.Constructor;

/**
 * 反射攻击破坏单例模式
 * @author stalern
 * @date 2019/10/4--17:49
 */
public class TestClass {
    public static void main(String[] args) throws Exception {
//        hungryTest();
        lazyTest();
//        enumTest();
    }

    private static void hungryTest() throws Exception {
        Class<HungrySingleton> hungryClass = HungrySingleton.class;

        // 拿到构造器
        Constructor<HungrySingleton> hungryConstructor = hungryClass.getDeclaredConstructor();
        hungryConstructor.setAccessible(true);

        HungrySingleton rawInstance = HungrySingleton.getHungry();
        HungrySingleton newInstance = hungryConstructor.newInstance();

        System.out.println(rawInstance);
        System.out.println(newInstance);
        System.out.println(newInstance == rawInstance);
    }

    private static void lazyTest() throws Exception {
        Class<GirlFriend> girlClass = GirlFriend.class;

        // 拿到构造器
        Constructor<GirlFriend> girlConstructor = girlClass.getDeclaredConstructor();
        girlConstructor.setAccessible(true);

        // 懒汉式无法禁止反射攻击，当这两个顺序不同时，就不可以
        GirlFriend newInstance = girlConstructor.newInstance();
        GirlFriend rawInstance = GirlFriend.getGirlFriend();

        System.out.println(rawInstance);
        System.out.println(newInstance);
        System.out.println(newInstance == rawInstance);
    }

    private static void enumTest() throws Exception {
        Class<EnumInstance> enumClass = EnumInstance.class;

        // 拿到构造器
        Constructor<EnumInstance> enumConstructor = enumClass.getDeclaredConstructor(String.class, int.class);
        enumConstructor.setAccessible(true);

        // 不能反射调用该方法，枚举类型不可反射
        EnumInstance newInstance = enumConstructor.newInstance("stalern", 123);
        EnumInstance rawInstance =EnumInstance.getInstance();

        System.out.println(rawInstance);
        System.out.println(newInstance);
        System.out.println(newInstance == rawInstance);
    }
}
