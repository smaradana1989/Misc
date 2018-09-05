package com.java.equals;


public class CompareEquals
{
    public static void main(String args[])
    {
        String str1= new String("hi h r u");
        String str2= new String("hi h r u");

        String str3="hi h r u";
        String str4="hi h r u";

        boolean result = str1==str2;

        System.out.println("== comparison for objects: "+ result);

        result = str3==str4;

        System.out.println("== comparison for primitives: "+ result);

        result = str1.equals(str2);

        System.out.println("equals comparison for objects: "+ result);

        result = str3.equals(str4);

        System.out.println("equals comparison for primitives: "+ result);

        str2= str1;

        result = str1==str2;

        System.out.println("== comparison for objects assigned: "+ result);

        Integer i1 = new Integer(12);

        result = str1==str3;

        System.out.println("== comparison for object and primitive: "+ result);

        int i2= 12;

        result = i1.equals(i2);

        System.out.println("equals comparison for object and primitive: "+ result);

        result=  i1==i2;

        System.out.println("== comparison for object and primitive integer: "+ result);

    }
}
