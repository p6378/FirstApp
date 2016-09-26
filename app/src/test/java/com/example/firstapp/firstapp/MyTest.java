package com.example.firstapp.firstapp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Director on 26.09.2016.
 */

public class MyTest {

    @Test
    public void testSum(){
        MyClass myClass = new MyClass();
        assertEquals(7, myClass.sum(4, 3));
    }
}
