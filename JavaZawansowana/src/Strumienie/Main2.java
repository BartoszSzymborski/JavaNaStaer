package Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("a","bb","ccc","dddd","eeeee","ffffff","ggggggg");
        List<String>stringList = strings.peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
