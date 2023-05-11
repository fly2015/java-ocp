package java21.com.basic.ch8_class_design.override;

public class PrivateOverride {
    public static void main(String[] args) {
        Parent p = new Child();
        //p.test1(); //DO not compile

        Child c = new Child();
        c.test1();
    }
}

class Parent
{
    private void test1(){
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    public void test1()
    {
        System.out.println("Children");
    }
}
