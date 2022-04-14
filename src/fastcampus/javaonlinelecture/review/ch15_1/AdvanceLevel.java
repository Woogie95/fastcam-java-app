package fastcampus.javaonlinelecture.review.ch15_1;

public class AdvanceLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빠르게 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("점프할 수 있다.");
    }

    @Override
    public void turn() {
        System.out.println("턴은 못해");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========중급 레벨==========");
    }
}
