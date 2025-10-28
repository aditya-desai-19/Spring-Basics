package stream;

import java.util.Arrays;
import java.util.List;

/*
When to use stream?
-> When we need to do multi level processing
-> Easy and readable syntax
 */

public class Stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        nums.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
