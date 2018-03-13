package com.android.szss.a2singleton.singleton;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

public class Singleton {

    //volatile 关键字 能保证在线程并发时，变量被改动了，所有线程都能及时访问到最新的数据
    // 但是会屏蔽掉虚拟机的一些代码优化
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
