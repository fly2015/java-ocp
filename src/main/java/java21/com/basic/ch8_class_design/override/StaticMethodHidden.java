package java21.com.basic.ch8_class_design.override;

public class StaticMethodHidden {

    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.test1();
        System.out.println(p.x);

        var c = new Child1();
        c.test1();
        System.out.println(c.x);
    }
}

class Parent1
{
    String x = "Parent";
    static void test1(){
        System.out.println("Parent");
    }
}

class Child1 extends Parent1
{
    static String x = "Children";
    public static void test1()
    {
        System.out.println("Children");
    }
}
