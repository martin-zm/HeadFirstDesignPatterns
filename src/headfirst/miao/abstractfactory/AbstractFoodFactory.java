package headfirst.miao.abstractfactory;

import headfirst.miao.abstractfactory.drink.IDrink;
import headfirst.miao.abstractfactory.eat.IEat;

/**
 * @Author miao
 * @Description: 食物工厂抽象类
 * @Date 2018/8/27 15:19
 */
public abstract class AbstractFoodFactory {
    public abstract IDrink createDrink();
    public abstract IEat createEat();
}
