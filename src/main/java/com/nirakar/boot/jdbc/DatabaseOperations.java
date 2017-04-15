package com.nirakar.boot.jdbc;
 
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
 
@Component
public class DatabaseOperations {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
 
    public void queryStudent() {
        System.out.println("Query employees");
        String sql = "SELECT ID, NAME, AGE FROM STUDENT";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : list) {
            System.out.println(row.get("name"));
        }
    }
 
    public void insertStudent(final Student student) throws SQLException {
        System.out.println("Insert student " + student);
        String sql = "INSERT into STUDENT(ID, NAME, AGE) VALUES (?, ?, ?)";
        jdbcTemplate.update(
                sql,
                new Object[] { student.getId(), student.getName(),
                        student.getAge() });
    }
}