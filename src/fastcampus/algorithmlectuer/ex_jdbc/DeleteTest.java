package fastcampus.algorithmlectuer.ex_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
           connection = JDBCUtil.getConnection();
            // 3단계 : 스테이트먼트 (고속버스) 생성
            String sql = "delete student1 where no=?";
            statement = connection.prepareStatement(sql);

            // SQL 파라미터 (?) 에 값 설정
            statement.setString(1, "22-000009");

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
