package com.android.szss.a1builder.build;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

public class Room {

    private String window;
    private String floor;

    public void apply(WorkBuilder.RoomParams params) {
        this.window = params.window;
        this.floor = params.floor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
