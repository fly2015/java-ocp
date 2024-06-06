package java21.com.advanced.ch15_functional;

public interface Test {
    public boolean test(int i);

    public abstract String toString();

    default void doSomething()
    {
        getSomething();
    }

    abstract void getSomething();
}
