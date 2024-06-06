/*
 * Test4.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Switch
{
    public static void main(String[] args)
    {
        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";
        int p = -1;
        switch (instrument)
        {
            case "bass":
                break;
            case CELLO:
                p++;
            default:
                p++;
            case "VIOLIN":
                p++;
            case "viola":
                ++p;
                break;
        }
        System.out.print(p);
    }
}



/*
 * Changes:
 * $Log: $
 */