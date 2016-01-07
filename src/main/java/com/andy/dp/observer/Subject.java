package com.andy.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色
 * Created by andy on 16/1/7.
 */
public abstract class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     *
     * @param observer: 观察者
     */
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * 删除观察者对象
     *
     * @param observer: 观察者
     */
    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("Detached an observer");
    }

    /**
     * 通知所有注册的观察者对象
     *
     * @param newState: 新状态消息
     */
    public void notifyObservers(String newState) {
        for (Observer observer : list) {
            observer.update(newState);
        }
    }
}
