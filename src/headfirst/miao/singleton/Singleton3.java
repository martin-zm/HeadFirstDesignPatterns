package headfirst.miao.singleton;

/**
 * @Author miao
 * @Description: 单独模式_双重校验锁
 * 实现了延迟加载，又解决了线程并发问题，同时还解决了执行效率问题
 * @Date 2018/8/26 15:33
 */
public class Singleton3 {
    // volatile禁止指令重排序，因为初始化Singleton和将对象地址赋给instance字段的顺序是不确定的。
    private static volatile Singleton3 instance = null;
    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}