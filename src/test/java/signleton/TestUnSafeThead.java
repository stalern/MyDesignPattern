package signleton;

/**
 * 多线程测试
 * @author stalern
 * @date 2019/10/2--11:07
 */
public class TestUnSafeThead {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestThead());
        Thread t2 = new Thread(new TestThead());

        t1.start();
        t2.start();
    }
}
