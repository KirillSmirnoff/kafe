package ru.corp.kafe;

import org.komamitsu.spring.data.sqlite.EnableSqliteRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSqliteRepositories
public class Run {

    public static void main(String[] args) {
    SpringApplication.run(Run.class, args);
    }
}
