package java21.com.jse17.record;

public record RecordCompactConstructor(int numberEggs, String name) 
{
    public RecordCompactConstructor {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }

    //No parentheses or constructor parameters
    //Refers to input parameters (not instance members)
    //Long constructor implicitly called at end
}