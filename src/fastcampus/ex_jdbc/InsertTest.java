package fastcampus.ex_jdbc;

public class InsertTest {
    public static void main(String[] args) {

        // 학생 정보를 등록한 후, 목록 출력
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.insertStudent("22-000020", "홍길동", 100, "기계 공학");
        studentDAO.getStudentList();
    }
}
