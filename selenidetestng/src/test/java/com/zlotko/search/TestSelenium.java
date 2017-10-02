package com.zlotko.search;


import org.testng.annotations.*;

import static java.lang.Thread.currentThread;

public class TestSelenium {

    @BeforeClass
    public void setUp() {
        System.out.println("Before Class MyThread: " + currentThread().getId());
    }


    @BeforeTest
    public void setMethod() {
        System.out.println("Before Test MyThread: " + currentThread().getId());
    }

    @AfterTest
    public void tearMethod() {
        System.out.println("After Test MyThread: " + currentThread().getId());
    }

    @AfterClass
    public void tearDown() {
        System.out.println("After Class MyThread: " + currentThread().getId());
    }

    @Test
    public  void test1() {
        System.out.println("Test 1 MyThread: " + currentThread().getId());
    }

    @Test
    public  void test2() {
        System.out.println("Test 2 MyThread: " + currentThread().getId());
    }

    @Test
    public  void test3() {
        System.out.println("Test 3 MyThread: " + currentThread().getId());
    }

    @Test
    public  void test4() {
        System.out.println("Test 4 MyThread: " + currentThread().getId());
    }

    @Test
    public  void test5() {
        System.out.println("Test 5 MyThread: " + currentThread().getId());
    }

    @Test
    public  void test6() {
        System.out.println("Test 6 MyThread: " + currentThread().getId());
    }
}
