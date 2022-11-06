package test_without_jUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicsTeacherTest {

    @Test
    void shouldCalculateDistance_WhenTimeAndSpeedArePositive() {
        //testo struktura:
        //1.given - kas yra duota, kokie yra testiniai duomenys
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        Double speed = 10.0;
        Double time = 5.0;

        //2.when - kai kas ivyksta?Koki metoda iskvieciam?
        Double actualDistance = physicsTeacher.calculateDistance(time, speed);
        //3.then - kokio rezultato as tada tikiuosi?
        //expexted - rezultata , kurio AS TIKIUOSI, actual  - rezultatas kuri grazina funkcija
        assertEquals(50, actualDistance);

    }
    @Test
    void shouldReturnValueOfDistanceZero_WhenTimeIsZero(){
        //1.given - kas yra duota, kokie yra testiniai duomenys
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        Double time = 0.0;
        Double speed = 1.0;
        Double actualDistance = physicsTeacher.calculateDistance(time, speed);
        //expexted - rezultata , kurio AS TIKIUOSI, actual  - rezultatas kuri grazina funkcija
        assertEquals(0.0, actualDistance);
    }

}