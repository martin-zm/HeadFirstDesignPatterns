package headfirst.miao.simplefactory;

/**
 * @Author miao
 * @Description: 创建的每一个实体类对应一个静态方法
 * @Date 2018/8/26 18:23
 */
public class Factory3 {

    public static IFruit getApple() {
        return new Apple();
    }
    public static IFruit getBanana() {
        return new Banana();
    }
    public static IFruit getPear() {
        return new Pear();
    }

    public static void main(String[] args) {
        getApple().desc();
    }
}