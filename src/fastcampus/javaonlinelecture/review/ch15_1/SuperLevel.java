package fastcampus.javaonlinelecture.review.ch15_1;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빨르게 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높게 뛴다.");
    }

    @Override
    public void turn() {
        System.out.println("턴도 가능.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========고급자 레벨==========");
    }
}
