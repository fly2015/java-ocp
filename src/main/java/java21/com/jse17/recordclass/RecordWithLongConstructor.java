package java21.com.jse17.record;

public record Crane(int numberEggs, String name) {
    public Crane(int numberEggs, String name) 
    {
        if (numberEggs < 0) throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}