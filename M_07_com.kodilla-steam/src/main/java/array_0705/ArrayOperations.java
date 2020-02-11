package array_0705;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int [] numbers){
        IntStream.range(0,numbers.length)
                .map(n-> numbers[n])
                .forEach(System.out::println);
        double number = IntStream.range(0, numbers.length)
                .mapToDouble(n-> numbers[n])
                .average()
                .getAsDouble();
        return number;

    }
}
