package FunctionalInterfaceandLambda;

import java.util.stream.Stream;

public class IterationDemo {
    public static void main(String[] args) {
        Stream.iterate(1, elements->elements+1)
        .filter(elements->elements%17==0)
        .limit(10)
        .forEach(System.out::println);
        
    }
}
