package com.lei.learn.sprintBoot.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DataSourceConfig extends HikariConfig {

    @Bean
    public DataSource dataSource() {
        return new HikariDataSource(this);
    }
}
