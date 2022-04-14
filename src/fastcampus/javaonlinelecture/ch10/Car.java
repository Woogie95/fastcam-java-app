package fastcampus.javaonlinelecture.ch10;

public abstract class Car {

    public abstract void drive();

    public abstract void stop();

    public abstract void wiper();

    public void statCar() {
        System.out.println("시동 킨다.");
    }

    public void turnOff() {
        System.out.println("시동 끈다.");
    }

    public void run() {
        statCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
