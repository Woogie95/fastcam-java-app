package fastcampus.algorithmlectuer.ex_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtil.getConnection();
            // 3단계 : 스테이트먼트 (고속버스) 생성
            String sql = "select * from student1";
            statement = connection.prepareStatement(sql);

            // 4단계 : SQL 전송
            // executeUpdate() 는 INSERT, UPDATE, DELETE 전용 메소드
            // executeQuery() 는 SELECT 전용 메소드
            resultSet = statement.executeQuery();

            // 5단계 : 검색 결과 활용
            System.out.println("[ STUDENT1 목록 ]");
            while (resultSet.next()) {
                System.out.print(resultSet.getString("NO") + " ");
                System.out.print(resultSet.getString("NAME") + " ");
                System.out.print(resultSet.getInt("SCORE") + " ");
                System.out.println(resultSet.getString("MAJOR"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(resultSet, statement, connection);
            System.out.println("프로그램 종료");
        }
    }
}
