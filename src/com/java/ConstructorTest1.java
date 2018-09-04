package com.java;


public class ConstructorTest1
{
    public ConstructorTest1(String test)
    {
        System.out.println("test: "+test);
    }

    public static void main(String args[])
    {
        ConstructorTest1 test=new ConstructorTest1("doesn't call default constructor when a constructor with args is defined");

    }

}
