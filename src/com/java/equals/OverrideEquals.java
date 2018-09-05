package com.java.equals;


public class OverrideEquals
{
    public static void main(String args[])
    {
        WithoutOverrideEquals woe1= new WithoutOverrideEquals(10, 15);
        WithoutOverrideEquals woe2= new WithoutOverrideEquals(10, 15);

        WithOverrideEquals we1 = new WithOverrideEquals(10, 15);
        WithOverrideEquals we2 = new WithOverrideEquals(10, 15);

        if(woe1.equals(woe2))
        {
            System.out.println("WithoutOverrideEquals true");
        }
        else
        {
            System.out.println("WithoutOverrideEquals false");
        }


        if(we1.equals(we2))
        {
            System.out.println("WithOverrideEquals true");
        }
        else
        {
            System.out.println("WithOverrideEquals false");
        }
    }

}
