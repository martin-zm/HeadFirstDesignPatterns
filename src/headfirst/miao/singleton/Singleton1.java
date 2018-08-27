package headfirst.miao.singleton;

/**
 * @Author miao
 * @Description: 单例模式_饿汉
 * 优点：类加载时候，只需要加载一次，没有多线程并发问题
 * 缺点：即使不使用，它也会加载
 * @Date 2018/8/26 15:16
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1(){}

    public static Singleton1 getInstance() {
        return instance;
    }
}
