package fastcampus.algorithmlectuer.ex_jdbc;

import org.h2.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
           connection = JDBCUtil.getConnection();
            // 3단계 : 스테이트먼트 (고속버스) 생성
            String sql = "update student1 set score=?, major=? where no=?";
            statement = connection.prepareStatement(sql);

            // SQL 파라미터 (?) 에 값 설정
            statement.setInt(1, 30);
            statement.setString(2, "사회복지학");
            statement.setString(3, "22-000001");

            // 4단계 : SQL 전송
            int count = statement.executeUpdate();
            System.out.println(count + "건의 데이터가 처리되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(statement, connection);
            System.out.println("프로그램 종료");
        }
    }
}
