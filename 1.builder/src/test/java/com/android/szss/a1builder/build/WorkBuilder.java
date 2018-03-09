package com.android.szss.a1builder.build;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/9
 */

public class WorkBuilder {

    private RoomParams mRoomParams;

    public WorkBuilder() {
        mRoomParams = new RoomParams();
    }

    public WorkBuilder makeWindow(String window) {
        mRoomParams.window = window;
        return this;
    }

    public WorkBuilder makeFloor(String floor) {
        mRoomParams.floor = floor;
        return this;
    }

    public Room build() {
        Room room = new Room();
        room.apply(mRoomParams);
        return room;
    }

    class RoomParams {

        public String window;
        public String floor;

    }

}
