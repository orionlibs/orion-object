package io.github.orionlibs.orion_object;

import java.util.UUID;

public class UUIDSecurityService
{
    public static String generateUUID()
    {
        return UUID.randomUUID().toString();
    }


    public static String generate2UUIDs()
    {
        return generateUUID() + generateUUID();
    }


    public static String generate3UUIDs()
    {
        return generateUUID() + generateUUID() + generateUUID();
    }


    public static String generateUUIDWithoutHyphens()
    {
        return generateUUID().replace("-", "");
    }


    public static String generate2UUIDsWithoutHyphens()
    {
        return generateUUIDWithoutHyphens() + generateUUIDWithoutHyphens();
    }


    public static String generate3UUIDsWithoutHyphens()
    {
        return generateUUIDWithoutHyphens() + generateUUIDWithoutHyphens() + generateUUIDWithoutHyphens();
    }
}