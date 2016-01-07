package com.andy.dp.observer;

/**
 * 抽象观察者角色
 * Created by andy on 16/1/7.
 */
public interface Observer {
    /**
     * 更新接口
     *
     * @param state: 更新的状态
     */
    void update(String state);
}
