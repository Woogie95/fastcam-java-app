package backendlecture.example;

public class CarFactory {

    private static final CarFactory carFactory = new CarFactory();
    private static int carNum = 1001;

    private CarFactory() {

    }

    public static CarFactory getInstance() {
        return carFactory;
    }

    public static Car createCar() {
        return new Car(carNum++);
    }
}
