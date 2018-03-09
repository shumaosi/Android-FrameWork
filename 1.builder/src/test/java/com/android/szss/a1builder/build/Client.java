package com.android.szss.a1builder.build;

import android.app.AlertDialog;

import org.junit.Test;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

public class Client {


    @Test
    public void test() {

        Room room = new WorkBuilder().makeWindow("法式窗户")
                .makeFloor("英式地板")
                .build();
        System.out.print(room);

    }

}
