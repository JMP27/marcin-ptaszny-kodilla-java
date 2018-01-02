/*
Losowanie lotto
        Za pomocą obiektu typu Scanner, wczytaj 6 liczb wprowadzonych przez użytkownika.
        Następnie przeprowadź losowanie 6 liczb z zakresu 1-49. Sprawdź ile liczb wpisanych przez użytkownika, pokryło się z liczbami wylosowanymi.

        Etapy dodatkowe:
        1) zadbaj aby użytkownik wprowadzał liczby z zakresu 1-49
        2) wprowadzone liczby przez użytkownika powinny być unikalnie, odpowiednia wiadomość przy próbie wprowadzenie dwóch tych samych liczb
        3) wylosowane liczby powinny być unikalne
*/
package com.lotto;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class KodillaLottoApplication {
    public static void main(String args[]){
        Random randomNumbers = new Random();

        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Integer> randomNumbersList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while(numbers.size() < 6) {
            System.out.println("Podaj liczbe: ");
            numbers.add(scanner.nextInt());
       }

        System.out.println(numbers);

        scanner.close();

        while(randomNumbersList.size() < 6) {
            Integer a = randomNumbers.nextInt(49) + 1;
            randomNumbersList.add(a);
        }

        int b = 0;

        for(Integer numbersEquals: numbers){
            if(randomNumbersList.contains(numbersEquals)){
                b = b + 1;
            }

        }
        System.out.println(randomNumbersList);
        System.out.println(b);


    }
}
