package java21.com.jse17.recordclass;

public record RecordWithTransformingParameters(int numberEggs, String name)
{
    public RecordWithTransformingParameters
    {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    /*
     * public record Crane(int numberEggs, String name)
     * {
     * public Crane
     * {
     * this.numberEggs = 10; // DOES NOT COMPILE
     * }
     * }
     */
}