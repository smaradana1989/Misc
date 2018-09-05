package com.java.equals;


public class WithOverrideEquals
{
    private double d1, d2;

    WithOverrideEquals(double d1, double d2)
    {
        this.d1= d1;
        this.d2= d2;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o==this)
        {
            return true;
        }

        if(!(o instanceof WithOverrideEquals))
        {
            return false;
        }

        WithOverrideEquals we= (WithOverrideEquals) o;

        return Double.compare(d1, we.d1) == 0 && Double.compare(d2, we.d2)==0;
    }
}
