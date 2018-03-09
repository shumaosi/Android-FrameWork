package com.android.szss.a2singleton.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

public class Connection {

    /*
    * 最多创建5个对象
    * */

    private static final int MAX = 5;

    private static int key = 1;

    private static Map<Integer, Connection> map = new HashMap<>();

    public static Connection getConnection() {
        Connection instance = map.get(key);
        if (instance == null) {
            synchronized (Connection.class) {
                if (instance == null) {
                    instance = new Connection();
                }
            }
            map.put(key, instance);
        }
        key++;
        if (key > MAX) {
            key = 1;
        }
        return instance;
    }

}
