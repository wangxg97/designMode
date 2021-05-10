package com.example.designmode.singleton;

/**
 * @author wangxg
 * @date 2021-04-21 5:24 下午
 * 单例模式
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
