package com.tangshengbo.design.observer;

/**
 * Created by tangshengbo on 2017/2/19.
 *所有潜在的观察者必须实现观察者接口，这个接口只有update()一个方法，当主题状态改变时它被调用
 */
public interface Observer {

    void update(Weather weather);

    void update();
}
