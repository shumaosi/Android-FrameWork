package com.android.szss.a2singleton.singleton;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

/*
*  饿汉式 (无法向单例对象的构造方法传参)
* */

public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public HungrySingleton getInstance() {
        return instance;
    }

}
