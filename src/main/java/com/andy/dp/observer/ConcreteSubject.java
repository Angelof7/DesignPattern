package com.andy.dp.observer;

/**
 * 具体主题角色类
 * Created by andy on 16/1/7.
 */
public class ConcreteSubject extends Subject {
    /**
     * 具体主题的状态信息
     */
    private String state;

    public String getState() {
        return state;
    }

    /**
     * 主题状态更新
     *
     * @param newState
     */
    protected void change(String newState) {
        state = newState;

        System.out.println("主题状态为: " + state);
        //状态发生改变，通知各个观察者
        this.notifyObservers();
    }
}
