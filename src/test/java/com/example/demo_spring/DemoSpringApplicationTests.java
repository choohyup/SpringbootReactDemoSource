package com.example.demo_spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class DemoSpringApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        // show datasource
        System.out.println(dataSource.getClass());
        //database connection
        Connection connection= dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
