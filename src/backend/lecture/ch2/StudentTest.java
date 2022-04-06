package backend.lecture.ch2;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.studentID = 89933716;
        student.setStudentName("SungWook");
        student.address = "인천시 서구";

        student.showStudentInfo();

        Student student1 = new Student();

        student1.studentID = 12345;
        student1.studentName = "kim";
        student1.address = "서울 강남구";

        student1.showStudentInfo();
    }
}
