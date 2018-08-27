package headfirst.miao.abstractfactory;

import headfirst.miao.abstractfactory.drink.Cola;
import headfirst.miao.abstractfactory.drink.IDrink;
import headfirst.miao.abstractfactory.eat.GongBaoJiDing;
import headfirst.miao.abstractfactory.eat.IEat;

/**
 * @Author miao
 * @Description: 简朴寨工厂类
 * @Date 2018/8/27 15:36
 */
public class JianPuZhaiFactory extends AbstractFoodFactory {
    public IDrink createDrink() {
        return new Cola();
    }
    public IEat createEat() {
        return new GongBaoJiDing();
    }
}
