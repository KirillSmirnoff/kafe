package ru.corp.kafe.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class BeverageRepository {
    private JdbcTemplate template;

    public BeverageRepository(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    /**
     * Метод принимает название напитка и возвращает его стоимость
     *
     * @param name название напитка
     * @return стоимость напитка
     */
    public int getPriceOfBeverage(String name){
        return template.queryForObject(String.format("select price from beverages where beverage = '%s'", name), Integer.TYPE);
    }
}
