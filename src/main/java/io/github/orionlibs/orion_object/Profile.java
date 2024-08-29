package io.github.orionlibs.orion_object;

import io.github.orionlibs.orion_enumeration.OrionEnumeration;

public enum Profile implements OrionEnumeration
{
    TestingProfile("testing"),
    LocalhostProfile("localhost"),
    DevProfile("dev"),
    ProductionProfile("production");


    private String name;


    private Profile(String name)
    {
        setName(name);
    }


    @Override
    public String get()
    {
        return getName();
    }


    public String getName()
    {
        return this.name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public boolean is(OrionEnumeration other)
    {
        return other instanceof Profile && this == other;
    }


    @Override
    public boolean isNot(OrionEnumeration other)
    {
        return other instanceof Profile && this != other;
    }


    public static boolean valueExists(String other)
    {
        Profile[] values = values();

        for(Profile value : values)
        {

            if(value.get().equals(other))
            {
                return true;
            }

        }

        return false;
    }


    public static Profile getEnumForValue(String other)
    {
        Profile[] values = values();

        for(Profile value : values)
        {

            if(value.get().equals(other))
            {
                return value;
            }

        }

        return null;
    }
}