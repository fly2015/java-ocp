package java21.com.advanced.ch15_functional.stream.collect;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
        Map<Boolean, List<String>> collect = List.of("b", "b", "c").stream().collect(Collectors.groupingBy(s -> s.contains("b")));
        Map<Boolean, List<String>> collect1 = Set.of("b", "c").stream().collect(Collectors.groupingBy(s -> s.contains("b")));
        //Map<Boolean, List<String>> collect2 = List.of("b", "b", "c").stream().collect(Collectors.partitioningBy(s -> s.contains("b")));

        record Person(int age){}
        record SumPerson(long count, int sum){};

        // Count and get sum of age
        Stream<Person> stream1 = Stream.of(new Person(1), new Person(2), new Person(3));
        Integer sum1 = stream1.map(person -> person.age()).collect(Collectors.summingInt(value -> value));
        System.out.println(sum1);

        //
        Stream<Person> stream2 = Stream.of(new Person(1), new Person(2), new Person(3));
        ToLongFunction<Person> func = (p) -> p.age();
        LongSummaryStatistics sum2 = stream2.collect(Collectors.summarizingLong(func));
        System.out.println(sum2.getCount());
        System.out.println(sum2.getSum());


        //
        ToIntFunction<Person> func1 = (p) -> p.age();
        Stream<Person> stream3 = Stream.of(new Person(1), new Person(2), new Person(3));
        SumPerson sumPerson = stream3.collect(Collectors.teeing(Collectors.counting(), Collectors.summingInt(func1), (count, num) -> { return new SumPerson(count, num);}));
        System.out.println(sumPerson);
    }
}
