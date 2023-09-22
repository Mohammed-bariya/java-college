
interface Vehicle {
    void start();
    void stop();
    void speedUp(int increment);
    void brake(int decrement);
}


class Car implements Vehicle {
    private int speed;

    public Car() {
        speed = 0;
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
        speed = 0;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car's speed increased to " + speed + " km/h");
    }

    @Override
    public void brake(int decrement) {
        if (speed >= decrement) {
            speed -= decrement;
            System.out.println("Car's speed decreased to " + speed + " km/h");
        } else {
            System.out.println("Car's speed cannot be decreased further");
        }
    }
}

public class ex8 {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.speedUp(50);
        car.brake(20);
        car.stop();
    }
}
