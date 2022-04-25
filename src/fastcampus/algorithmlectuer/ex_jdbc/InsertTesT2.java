package fastcampus.algorithmlectuer.ex_jdbc;

import org.h2.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTesT2 {
    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        PreparedStatement statement = connection.prepareStatement("insert into student1(no, name, score, major) values('22-000009','아저씨',10, '체육 공학')");
        statement.executeUpdate();
    }
}
