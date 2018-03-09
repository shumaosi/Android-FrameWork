package com.android.szss.framework;

import com.android.szss.framework.factory.Api;
import com.android.szss.framework.factory.Factory;
import com.android.szss.framework.factory.ImplC;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void test() {

        Api api = Factory.create(2);
        api.operation();

        System.out.print("\n");

        Api api2 = Factory.createProduct(ImplC.class);
        api2.operation();

    }
}