package fastcampus.algorithmlectuer.ex_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
    // JDBC 관련 변수
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    // STUDENT 테이블 관련 SQL 명령어
    private final String STUDENT_LIST = "select * from student";
    private final String STUDENT_INSERT = "insert into student values(?, ?, ?, ?)";

    // STUDENT 테이블 관련 CRUD 메소드
    // 학생 등록
    public void insertStudent(String no, String name, int score, String major) {
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(STUDENT_INSERT);
            stmt.setString(1, no);
            stmt.setString(2, name);
            stmt.setInt(3, score);
            stmt.setString(4, major);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(stmt, conn);
        }
    }

    // 학생 목록 조회
    public void getStudentList() {
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(STUDENT_LIST);
            rs = stmt.executeQuery();
            System.out.println("[ STUDENT1 목록 ]");
            while (rs.next()) {
                System.out.print(rs.getString("NO") + " : ");
                System.out.print(rs.getString("NAME") + " : ");
                System.out.print(rs.getInt("SCORE") + " : ");
                System.out.println(rs.getString("MAJOR"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }
    }
}
