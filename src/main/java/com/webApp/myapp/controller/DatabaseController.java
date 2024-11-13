package com.webApp.myapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.webApp.myapp.database.DatabaseService;

@RestController
public class DatabaseController {

    @Autowired
    private DatabaseService databaseService;

    @GetMapping("/tables")
    public List<String> getAllTables() {
        return databaseService.getAllTables();
    }
}
