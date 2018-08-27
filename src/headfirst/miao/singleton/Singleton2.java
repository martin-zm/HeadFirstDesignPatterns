package headfirst.miao.singleton;

/**
 * @Author miao
 * @Description: 单独模式_懒汉
 * 优点：安照需要创建
 * 缺点：有线程安全问题
 * @Date 2018/8/26 15:26
 */
public class Singleton2 {
    private static Singleton2 instance = null;
    private Singleton2 () {}

    // 线程不安全
    public static Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }

    // 线程安全(性能太低了)
    public static synchronized Singleton2 getInstance1() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
}