package headfirst.miao.simplefactory;

/**
 * @Author miao
 * @Description: 使用分支语句来实现的工厂方法
 * 缺点: 新增实体时候，需要修改方法，麻烦
 * @Date 2018/8/26 16:44
 */
public class Factory1 {
    public static final int AppleType = 1;
    public static final int BananaType = 2;
    public static final int PearType = 3;

    public static IFruit getIFruit(int type) {
        switch (type) {
            case AppleType:
                return new Apple();
            case BananaType:
                return new Banana();
            case PearType:
            default:
                return new Pear();
        }
    }

    public static void main(String[] args) {
        getIFruit(1).desc();
    }
}
