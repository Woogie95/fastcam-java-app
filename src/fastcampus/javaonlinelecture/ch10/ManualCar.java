package fastcampus.javaonlinelecture.ch10;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전 한다.");
        System.out.println("사람이 핸들을 바꾼다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 브레이크를 밟아 멈춘다.");

    }

    @Override
    public void wiper() {
        System.out.println("사람이 와이퍼를 킨다.");
    }
}
