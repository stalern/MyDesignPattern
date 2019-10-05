package signleton;

import com.stalern.singleton.lazy.BoyFriend;
import com.stalern.singleton.lazy.GirlFriend;

/**
 * 线程测试类
 * @author stalern
 * @date 2019/10/2--11:08
 */
public class TestThead implements Runnable {
    @Override
    public void run() {
        GirlFriend girlFriend = GirlFriend.getGirlFriend();
        BoyFriend boyFriend = BoyFriend.getBoyFriend();
        System.out.println(Thread.currentThread().getName() + " " + boyFriend);
    }
}
