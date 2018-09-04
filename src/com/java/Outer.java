package com.java;


public class Outer
{
    static class Inner
    {
        public void testInner(String test)
        {
            System.out.println("test class Inner: " + test);
        }

        public static void test()
        {
            System.out.println("Inside static inner class " );
        }
    }
}

class TestOuter
{
    public void test()
    {
        System.out.println("Inside testOuter class " );
    }
}
