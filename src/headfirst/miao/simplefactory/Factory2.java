package headfirst.miao.simplefactory;

/**
 * @Author miao
 * @Description: 使用反射实现
 * @Date 2018/8/26 16:50
 */
public class Factory2 {
    public static <T extends IFruit> T getInstance(Class<T> className) {
        T result = null;
        try {
            result = (T) Class.forName(className.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        getInstance(Apple.class).desc();
    }

}
