package fastcampus.javaonlinelecture.review.ch15_1;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("느리게 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("점프는 못해");
    }

    @Override
    public void turn() {
        System.out.println("턴도 못해");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========초보자 레벨==========");
    }
}
