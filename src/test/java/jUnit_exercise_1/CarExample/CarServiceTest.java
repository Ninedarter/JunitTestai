package jUnit_exercise_1.CarExample;

import jUnit_exercise_1.CarExample.Car;
import jUnit_exercise_1.CarExample.CarService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void shouldChangeCarColor_WhenNewColorIsGiven() {
        //given
        CarService labaiGerasServisas = new CarService();
        Car volvo = new Car("Volvo","White", false);

        //when
        labaiGerasServisas.paintCar(volvo,"Black");

        //then

        assertEquals("Black",volvo.color);
    }

    @Test
    void shouldNotChangeCarColor_WhenGivenColorIsTheSame() {
        //given
        CarService labaiGerasServisas = new CarService();
        Car volvo = new Car("Volvo","White", false);
        //when
        labaiGerasServisas.paintCar(volvo,"White");
        //then
        assertEquals("White",volvo.color);



    }

    @Test
    void randomTestForAsserts() {
        assertEquals(5,5);
        boolean isOld = true;
        assertTrue(true);
        

    }
}