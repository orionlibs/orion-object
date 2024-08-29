package io.github.orionlibs.orion_object;

import java.io.Closeable;
import java.io.IOException;

public class ResourceCloser
{
    public static boolean closeResource(Closeable closeable)
    {
        if(closeable != null)
        {
            try
            {
                closeable.close();
                return true;
            }
            catch(IOException e)
            {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}