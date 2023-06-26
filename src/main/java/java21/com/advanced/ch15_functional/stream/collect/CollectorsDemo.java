package java21.com.advanced.ch15_functional.stream.collect;

import java.util.IntSummaryStatistics;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java21.com.advanced.ch14_generic_and_collection.collection.Person;

public class CollectorsDemo {
    public static void main(String[] args)
    {
        record Person(int age){}
        record SumPerson(long count, int sum){}
        
        var stream = Stream.of(new Person(1), new Person(2), new  Person(3));
       // BiConsumer<Person, Person> merge = (p1, p2) -> { return;};
        Collector<Object, ? , Long> counting = Collectors.counting();
        Collector<Person, ? , IntSummaryStatistics> summarizingInt = Collectors.summarizingInt(Person::age);
        //BiConsumer<Collectors> func = 
       // stream.collect(Collectors.teeing(counting, summarizingInt), func);
    }
}
