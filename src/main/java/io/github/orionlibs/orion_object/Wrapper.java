package io.github.orionlibs.orion_object;

public class Wrapper
{
    private Object object;


    public Wrapper(Object object)
    {
        this.object = object;
    }


    public static Wrapper of(Object object)
    {
        return new Wrapper(object);
    }


    public Object getObject()
    {
        return this.object;
    }
}