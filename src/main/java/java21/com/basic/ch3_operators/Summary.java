package java21.com.basic.ch3_operators;

public class Summary {
    public static void main(String[] args) {
        int count1  = +1;
        int count2 = -3;
        int count3 = ~count1; //=-2
        /*
            Tilde -> invert bit
            - only used with integer values
            - inverts the bits ie a 0-bit becomes 1-bit and vice versa
            - in all cases ~x equals (-x)-1
         */
        System.out.println(count3);

        Number x = 10;

        //
        System.out.println(null instanceof Number);


        //
        short b = 10 + 1;//OK
        int a = 10;
        short c = (byte)(a*2);//OK
        double k = 100;
        float r = (float)((k==1000f) ? 10d : a*2L);//OK

        addValue(10L, 10f);//a long can pass to a double
        addValue(10L, 10000000L);// a long can pass to a float
        double a1= 10d;
        a1= 10L;
        float a2 = 10f;
        a2 = 10L;
        boolean bool = 10L==10.1f;
        System.out.println(bool);
        long f = (long) (10.0f + 10);// must be cast
        long f1 = (long) (10.0d + 10);// must be cast
        double f3 = 10.0f + 10L;// must be cast
        f -= 1.0d; // no need cast
        System.out.println();
    }

    static void addValue(double x, float y)
    {

    }
}
