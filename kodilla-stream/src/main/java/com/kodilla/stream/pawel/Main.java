package com.kodilla.stream.pawel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{

    public static long getCountEmptyStringUsingJava8(List<String> emptyString){
        return emptyString.stream().filter(n -> n.isEmpty()).count();
    }

    public static long getCountLength3UsingJava8(List<String> countLenght){
        return countLenght.stream().filter(n -> n.length() == 3).count();
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> emptyString){

        return emptyString.stream().filter(n -> n.length() != 0).collect(Collectors.toList());
    }

    public static String getMergedStringUsingJava8(List<String> mergedString, String separete){
        return mergedString.stream().filter(n -> n.length() != 0).collect(Collectors.joining(separete));
    }

    public static List<Integer> getSquaresJava8(List<Integer> getNumbers) {
        return getNumbers.stream().map(n -> n.intValue() * n).distinct().collect(Collectors.toList());
    }

    public static Integer getMaxJava8(List<Integer> numbers){
        return numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
    }

    public static Integer getMinJava8(List<Integer> numbers){
        return numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
    }

    public static Integer getSumJava8(List<Integer> numbers){
        long longNum = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        return (int)longNum;
    }

    public static Integer getAverageJava8(List<Integer> numbers){
        double doubleNum = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
        return (int)doubleNum;
    }



}
