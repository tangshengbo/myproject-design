package com.tangshengbo.design.decorate;

/**
 * Created by tangshengbo on 2017/2/22.
 */
public class Mocha extends CondimentDecorator {

    // 要让Mocha能够引用一个Beverage，做法如下：
    // 1.用一个实例变量记录饮料，也就是被装饰者
    // 2.想办法让被装饰者（饮料）被记录到实例变量中。
    // 这里的做法是：把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 10.1 + beverage.cost();
    }
}
