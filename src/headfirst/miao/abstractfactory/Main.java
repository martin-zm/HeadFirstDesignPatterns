package headfirst.miao.abstractfactory;

/**
 * @Author miao
 * @Description: 测试类
 * @Date 2018/8/27 15:38
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("正在星巴克学习中~");
        AbstractFoodFactory factory1 = new StarbucksFactory();
        factory1.createDrink().desc();
        factory1.createEat().desc();
        System.out.println("-----------------");
        System.out.println("正在简朴寨用餐中~");
        AbstractFoodFactory factory2 = new JianPuZhaiFactory();
        factory2.createEat().desc();
        factory2.createDrink().desc();
        System.out.println("-----------------");
    }
}
