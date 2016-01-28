package ru.kir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 * Created by Kirill Zhitelev on 27.01.2016.
 */
public class Text {
    private Connection connection = DBWork.getConnection();
    private Random random = new Random();
    private static final String getText = "SELECT text FROM test_db.test_sql WHERE id=";

    public String getTextFromDB() {
        String text = null;
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getText + (random.nextInt(2)+1))) {

            while (resultSet.next()) {
                text = resultSet.getString(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return text;
    }
}
