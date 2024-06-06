package java21.com.advanced.ch14_generic_and_collection;

import java.util.ArrayList;
import java.util.List;

public class Summary {
    public static void main(String[] args) {
        List<? super String> list = new ArrayList<CharSequence>();
        list.add(null);
       // list.add(new Object())// do not compile
        list.add("aa");

        int i = Integer.MAX_VALUE;
        float f = i;
        System.out.println(i);
        System.out.println(f);
    }
}
