package jUnit_exercise_1.CarExample;

public class CarService {
    /**
     * method to change a color of the car
     *
     * @param car          object that will be painted
     * @param colorToPaint specific color to change to
     */
    public void paintCar(Car car, String colorToPaint) {
        System.out.println("Current car color is" + car.color);
        if (colorToPaint.equals(car.color)) {
            System.out.println("Will not paint the ca");
        } else {
            System.out.println("Painting car..");
            car.color = colorToPaint;
            System.out.println("Car color is now  " + car.color);
        }
    }


}
