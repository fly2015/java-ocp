package java21.com.advanced.ch12_fundamentals.summary;

public class Child extends Parent{
    public void getSomethingFromParent()
    {
        System.out.println(super.a + this.b);
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.getSomethingFromParent();
    }
}
