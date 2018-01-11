package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

/* W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite,
   a w niej napisz testy sprawdzające czy metoda filtrująca liczby nieparzyste działa poprawnie:
 * testOddNumbersExterminatorEmptyList (sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta)
 * testOddNumbersExterminatorNormalList (sprawdzi czy klasa zachowuje się poprawnie
 * gdy lista zawiera liczby parzyste i nieparzyste)
 * Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.
*/
public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbers() {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> losNumbers = new ArrayList<>();

        Random randomNumbers = new Random();
        int i = 0;

        while(i<10) {
            losNumbers.add(randomNumbers.nextInt(11) + 1);
            i++;
        }

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(evenNumbers,losNumbers);

        evenNumbers = oddNumbersExterminator.exterminate(losNumbers);



        System.out.println("Test Numbers: " + losNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
    }


}
