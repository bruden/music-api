package team.burden.music.api.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sqlite.SQLiteDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @program: music-api
 * @description:
 * @author: burden
 * @create: 2020-11-21 16:36
 */
@Configuration
public class SqliteConfig {

    @Resource
    private DataSourceProperties dataSourceProperties;

    @Bean
    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(dataSourceProperties.getUrl());
        return dataSource;
    }

}
