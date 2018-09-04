package com.java;

import com.java.Outer.Inner;

public class InnerClassTest
{
    public static void main(String args[])
    {
        Outer out= new Outer();
        Inner inner= new Outer.Inner();

        inner.testInner("test Inner");
        InnerClassTest intval= new InnerClassTest();
        boolean check= intval.testInstance(inner);
        System.out.println("check: "+check);

        String str="str";
        boolean check1= intval.testInstance(str);
        System.out.println("check: "+check1);

        StringBuilder stb=new StringBuilder("test");
        boolean check2= intval.testInstance(stb);
        System.out.println("check: "+check2);
        inner.test();
        TestOuter testouter=new TestOuter();
        testouter.test();
    }

    public boolean testInstance(Object o)
    {
        boolean result= false;
        if(Inner.class.isInstance(o))
        {
            return true;
        }
        return result;
    }

    public boolean testInstance(String o)
    {
        boolean result= false;
        if(StringBuilder.class.isInstance(o))
        {
            return true;
        }
        return result;
    }

    public boolean testInstance(StringBuilder o)
    {
        boolean result= false;
        if(String.class.isInstance(o))
        {
            return true;
        }
        return result;
    }
}
