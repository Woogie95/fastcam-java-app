package fastcampus.javaonlinelecture.review.ch15_1;

public class UltraSuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("나는 최고로 빨라");
    }

    @Override
    public void jump() {
        System.out.println("나는 최고로 높이 뛰어");
    }

    @Override
    public void turn() {
        System.out.println("나는 최고로 턴할 수 있어");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========초고수 레벨==========");
    }
}
