package com.andy.dp.observer;

import org.junit.Test;

/**
 * 观察者模式测试类
 * Created by andy on 16/1/7.
 */
public class AppTest {
    @Test
    public void test(){
        // 创建主题对象
        ConcreteSubject subject = new ConcreteSubject();

        // 创建观察者对象
        Observer observer = new ConcreteObserver();

        // 将观察者对象登记到主题对象上
        subject.attach(observer);

        // 改变主题对象的状态
        subject.change("andy is coming!");
    }

}
