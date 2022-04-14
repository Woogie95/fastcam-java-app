package fastcampus.javaonlinelecture.ch10;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행 한다.");
        System.out.println("자동차가 방향을 스스로 바꾼다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 스스로 멈춘다.");
    }

    @Override
    public void wiper() {
        System.out.println("자동으로 와이퍼를 킨다.");
    }
}
