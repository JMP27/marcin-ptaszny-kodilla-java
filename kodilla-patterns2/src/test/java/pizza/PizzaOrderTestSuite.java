package pizza;

import com.kodilla.patterns2.decorator.pizza.BasicPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.ExtraCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.PepperoniDecorator;
import org.junit.Test;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testMeatyAndVeggiePizzaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21.5), theCost);
    }

    @Test
    public void testMeatyAndVeggiePizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("pizza margarita + extra cheese + pepperoni", description);
    }
}
