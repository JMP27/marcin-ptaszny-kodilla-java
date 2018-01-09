/*
Celem zadania jest napisanie odpowiednich metod, aby sprawdzić ile losowań powinno się odbyć aby użytkownik trafił sześć liczb z sześciu wylosowanych.
Liczby losowane przez komputer powinny być z zakresu 1-49.
Liczby użytkownika mogą być wprowadzone ręcznie w kodzie, wprowadzone przez Scanner bądź wylosowane.
Wyświetl obie listy, zrobic historię 20 losowań;

 */

package com.lotto_second;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by JMP on 08.01.2018.
 */
public class Application {
    public static void main(String args[]){
    int i = 0; //
    int j = 0;
    HashSet<Integer> numbersUser = los();
    LinkedList<Integer> history = new LinkedList<>();

    for(int k = 0 ; k < 4 ; k++) {
        while (i < 6) {
            i = numbersCheck(los(), numbersUser);
            j++;
            history.add(k,j);
        }
        history.add(k,j);

    }
    System.out.println(numbersUser);
    System.out.println();
    for(int u=0;u<20;u++) {
        System.out.println("Mesurment Number " + u + " Number " + history.get(u));
    }

    }

    public static HashSet<Integer> los(){
        Random random = new Random();
        HashSet<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6){
            numbers.add(random.nextInt(49) + 1);
        }

    return numbers;
    }

    public static int numbersCheck(HashSet<Integer> numbersLos, HashSet<Integer> numbersUser){
        int i = 0; // counter
        for(Integer numbers: numbersUser) {
            if(numbersLos.contains(numbers)){
                i++;
            }
        }
        return i;
    }

}
