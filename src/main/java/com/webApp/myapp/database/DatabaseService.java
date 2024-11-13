package com.webApp.myapp.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


@Service
public class DatabaseService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllTables() {
        List<String> tables = new ArrayList<>();
        jdbcTemplate.query("SHOW TABLES", (ResultSet rs) -> {
            while (rs.next()) {
                tables.add(rs.getString(1));
            }
        });
        return tables;
    }
}

