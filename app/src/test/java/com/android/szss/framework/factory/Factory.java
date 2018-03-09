package com.android.szss.framework.factory;

/**
 * @Description:
 * @author： 鼠茂斯
 * @date： 2018/3/1
 */

public class Factory {

    public static Api create(int type) {

        switch (type) {

            case 1:
                return new ImplA();
            case 2:
                return new ImplB();
            default:
                return new ImplC();

        }

    }

    public static <T extends Api> T createProduct(Class<T> cla) {
        Api api = null;
        try {
            api = (Api) Class.forName(cla.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) api;
    }


}
