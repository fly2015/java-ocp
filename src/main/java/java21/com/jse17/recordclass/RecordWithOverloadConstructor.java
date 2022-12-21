package java21.com.jse17.recordclass;

public record RecordWithOverloadConstructor(int numberEggs, String name)
{
    public RecordWithOverloadConstructor(String firstName, String lastName)
    {
        this(0, firstName + " " + lastName);
        // this(numberEggs + 1, firstName + " " + lastName);
        // numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
        // this.numberEggs = 20; // DOES NOT COMPILE
    }
}
