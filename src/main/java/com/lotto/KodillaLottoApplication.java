/*
Losowanie lotto
        Za pomocą obiektu typu Scanner, wczytaj 6 liczb wprowadzonych przez użytkownika.
        Następnie przeprowadź losowanie 6 liczb z zakresu 1-49. Sprawdź ile liczb wpisanych przez użytkownika, pokryło się z liczbami wylosowanymi.

        Etapy dodatkowe:
        1) zadbaj aby użytkownik wprowadzał liczby z zakresu 1-49
        2) wprowadzone liczby przez użytkownika powinny być unikalnie, odpowiednia wiadomość przy próbie wprowadzenie dwóch tych samych liczb
        3) wylosowane liczby powinny być unikalne
*/

/*
Celem zadania jest napisanie odpowiednich metod, aby sprawdzić ile losowań powinno się odbyć aby użytkownik trafił sześć liczb z sześciu wylosowanych.
Liczby losowane przez komputer powinny być z zakresu 1-49.
Liczby użytkownika mogą być wprowadzone ręcznie w kodzie, wprowadzone przez Scanner bądź wylosowane.

 */
package com.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class KodillaLottoApplication {
    public static void main(String args[]){
        Random randomNumbers = new Random();

        HashSet<Integer> numbers = new HashSet<>();
        HashSet<Integer> randomNumbersList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unique number: ");
        while(numbers.size() < 6){
            boolean contains = false;
            contains = numbers.add(scanner.nextInt());
                if(numbers.size() == 6){
                  break;
                }

                if ( contains) {
                    System.out.print("Enter the next unique number: ");
                } else {
                    System.out.print("There is already such a number, Enter the next unique number: ");
                }
       }

        scanner.close();

        while (randomNumbersList.size() < 6) {
            Integer a = randomNumbers.nextInt(49) + 1;
            randomNumbersList.add(a);
        }

        int b = 0;
        for(Integer numbersEquals: numbers){
            if(randomNumbersList.contains(numbersEquals)){
                b = b + 1;
            }
        }

        System.out.println("Numbers added by the user: " + numbers);
        System.out.println("Numbers added by random function: " +randomNumbersList);
        System.out.println("Number of repeating numbers : " + b);


    }

}
