package fastcampus.javaonlinelecture.ch10;

public class CarTest {
    public static void main(String[] args) {

        Car car = new AICar();
        car.run();
        System.out.println();
        Car mCar = new ManualCar();
        mCar.run();
    }
}
