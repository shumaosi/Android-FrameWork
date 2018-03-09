package com.android.szss.a2singleton.singleton;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

/*
*  懒汉式
* */

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
