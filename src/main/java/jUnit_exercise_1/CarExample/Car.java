package jUnit_exercise_1.CarExample;

public class Car {

    public String name;
    public String color;
    public boolean isBroken;

    public Car(String name, String color, boolean isBroken) {
        this.name = name;
        this.color = color;
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isBroken=" + isBroken +
                '}';
    }
}
