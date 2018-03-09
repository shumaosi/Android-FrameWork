package com.android.szss.a2singleton.singleton;

import org.junit.Test;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

public class Client {

    @Test
    public void test() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Connection.getConnection());
        }
    }

}
