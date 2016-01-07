package com.andy.dp.observer;

/**
 * Created by andy on 16/1/7.
 */
public class ConcreteObserver implements Observer {
    /**
     * 观察者的状态
     */
    private String observerState;

    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标状态保存一致
         */
        observerState = state;
        System.out.println("观察者状态为:" + observerState);
    }
}
