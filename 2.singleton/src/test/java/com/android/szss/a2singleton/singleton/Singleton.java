package com.android.szss.a2singleton.singleton;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

public class Singleton {

    private static volatile Singleton mInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }

}
