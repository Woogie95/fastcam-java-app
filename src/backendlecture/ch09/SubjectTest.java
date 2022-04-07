package backendlecture.ch09;

public class SubjectTest {
    public static void main(String[] args) {

        Student student = new Student(95, "Choi");
        student.setKoreaSubject("국어", 95);
        student.setMathSubject("수학", 100);


        Student student1 = new Student(100, "Kim");
        student1.setKoreaSubject("국어", 50);
        student1.setMathSubject("수학", 65);

        student.showScoreInfo();
        student1.showScoreInfo();
    }

}
