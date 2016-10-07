package com.drf.tf.ratings.domain;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by eceballos on 10/04/2016.
 */
@Configuration
@EnableJpaRepositories (basePackages = {"com.drf.tf.ratings"})
@EnableTransactionManagement
@ComponentScan (basePackages = "com.drf.tf.ratings")
public class DataConfiguration {

	@Value ("${db.driver}")
	private String dbDriver;
	@Value ("${db.url}")
	private String dbUrl;
	@Value ("${db.username}")
	private String dbUserName;
	@Value ("${db.password}")
	private String dbPassword;

	@Profile ("!test")
	@Bean (destroyMethod = "close")
	DataSource dataSource(Environment env) {
		HikariConfig dataSourceConfig = new HikariConfig();
		dataSourceConfig.setDriverClassName(dbDriver);
		dataSourceConfig.setJdbcUrl(dbUrl);
		dataSourceConfig.setUsername(dbUserName);
		dataSourceConfig.setPassword(dbPassword);
		return new HikariDataSource(dataSourceConfig);
	}

	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}

}
