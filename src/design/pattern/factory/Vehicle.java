package design.pattern.factory;

public interface Vehicle {
    int getWheel();

    default void print() {
        System.out.println(this.getWheel());
    }
}

class Car implements Vehicle {
    private int wheel;

    Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Bike implements Vehicle {
    private int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}
