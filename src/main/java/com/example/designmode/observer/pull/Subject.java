package com.example.designmode.observer.pull;

/**
 * @author wangxg
 * @date 2021-04-12 5:58 下午
 * 主题接口
 */
public interface Subject {
    //注册观察者
    public void registerObserver(Observer o);

    //移除观察者
    public void removeObserver(Observer o);

    //主题状态改变，通知所有观察者
    public void notifyObservers();
}
