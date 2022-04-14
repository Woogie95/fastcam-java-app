package fastcampus.javaonlinelecture.review.ch15_1;

public class PlayerApp {
    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvanceLevel advanceLevel = new AdvanceLevel();
        player.upgradeLevel(advanceLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);

        UltraSuperLevel ultraSuperLevel = new UltraSuperLevel();
        player.upgradeLevel(ultraSuperLevel);
        player.play(4);

    }
}
