package java21.com.jse17.recordclass;

public record RecordWithLongConstructor(int numberEggs, String name)
{
    public RecordWithLongConstructor(int numberEggs, String name)
    {
        if (numberEggs < 0)
            throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}