package com.forum.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**创建数据源事务通知，交给spring管理*/
@Configuration
public class SpringServiceConfig {
	@Bean
	public DataSourceTransactionManager newTransactionManager(DataSource dataSource) {
		DataSourceTransactionManager tm = new DataSourceTransactionManager();
		tm.setDataSource(dataSource);
		return tm;
	}
}
