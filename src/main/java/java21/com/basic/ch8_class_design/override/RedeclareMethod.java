package java21.com.basic.ch8_class_design.override;

public class RedeclareMethod {
}

class Parent2
{
    void reDeclaremMe()
    {

    }
}

class  Child2 extends  Parent2
{
    int reDeclaremMe(int x)
    {
        return 0;
    }
}