package headfirst.miao.abstractfactory;

import headfirst.miao.abstractfactory.drink.Coffee;
import headfirst.miao.abstractfactory.drink.IDrink;
import headfirst.miao.abstractfactory.eat.IEat;
import headfirst.miao.abstractfactory.eat.TiLaMiShu;

/**
 * @Author miao
 * @Description: 星巴克工厂
 * @Date 2018/8/27 15:32
 */
public class StarbucksFactory extends AbstractFoodFactory {
    public IEat createEat() {
        return new TiLaMiShu();
    }

    public IDrink createDrink() {
        return new Coffee();
    }
}
