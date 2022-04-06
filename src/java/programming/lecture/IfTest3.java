package java.programming.lecture;

public class IfTest3 {
    public static void main(String[] args) {
        int javaScore = 89;

        if (javaScore >= 90) {
            System.out.println(javaScore + "점은 A 등급입니다.");
        } else if (javaScore >= 80) {
            System.out.println(javaScore + "점은 B 등급입니다.");
        } else if (javaScore >= 70) {
            System.out.println(javaScore + "점은 C 등급입니다.");
        } else if (javaScore >= 60) {
            System.out.println(javaScore + "점은 D 등급입니다.");
        } else {
            System.out.println(javaScore + "점은 F 등급입니다.");
        }

    }
}
