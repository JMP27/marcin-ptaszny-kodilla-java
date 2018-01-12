package com.kodilla.testing.collection;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;

/*2. W utworzonym pakiecie stwórz klasę OddNumbersExterminator posiadającą
   metodę exterminate(ArrayList<Integer> numbers)
 * przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
 * która zwraca również kolekcję ArrayList liczb typu Integer,
 * stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
*/
public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int i=0 ; i<numbers.size();i++){
            int a = numbers.get(i);
            if(a%2 == 0){
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }
}
