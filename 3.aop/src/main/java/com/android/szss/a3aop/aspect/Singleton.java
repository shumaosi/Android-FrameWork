package com.android.szss.a3aop.aspect;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/13
 */

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
