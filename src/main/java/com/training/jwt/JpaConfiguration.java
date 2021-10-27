package com.training.jwt;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.training.v1.constant.SeriConstant;

@Configuration
@EnableJpaRepositories(basePackages = "com.training")
@EnableTransactionManagement
public class JpaConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_DATABASE_DRIVER.getValue()));
		dataSource.setUrl(environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_DATABASE_URL.getValue()));
		dataSource.setUsername(environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_DATABASE_USERNAME.getValue()));
		dataSource.setPassword(environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_DATABASE_PASSWORD.getValue()));
		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		final LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setPersistenceUnitName("Training-Persistence");
		factoryBean.setPackagesToScan("com.training.entity");
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		factoryBean.setJpaProperties(jpaProperties());
		return factoryBean;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		return new HibernateJpaVendorAdapter();
	}

	private Properties jpaProperties() {
		final Properties properties = new Properties();
		properties.put(SeriConstant.PROPERTY_NAME_JPA_DIALECT.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_JPA_DIALECT.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_JPA_DDL_UPDATE.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_JPA_DDL_UPDATE.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_JPA_SHOW_SQL.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_JPA_SHOW_SQL.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_INITIAL_SIZE.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_INITIAL_SIZE.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_MAX_ACTIVE.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_MAX_ACTIVE.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_MAX_IDLE.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_MAX_IDLE.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_JMX_ENABLED.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_JMX_ENABLED.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_TIME_BETWEEN_EVICTION_RUN.getValue(), environment
				.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_TIME_BETWEEN_EVICTION_RUN.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED_TIMEOUT.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED_TIMEOUT.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED_WHEN_PERCENTAGE_FULL.getValue(),
				environment.getRequiredProperty(
						SeriConstant.PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED_WHEN_PERCENTAGE_FULL.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_TEST_ON_BORROW.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_TEST_ON_BORROW.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_VALIDATION_QUERY.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_VALIDATION_QUERY.getValue()));
		properties.put(SeriConstant.PROPERTY_NAME_TOMCAT_VALIDATION_INTERVAL.getValue(),
				environment.getRequiredProperty(SeriConstant.PROPERTY_NAME_TOMCAT_VALIDATION_INTERVAL.getValue()));
		return properties;
	}

	@Bean
	public JpaTransactionManager transactionManager() {
		final JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return txManager;
	}

	@Bean
	public ThreadPoolTaskExecutor taskExecutor() {
		final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(100);
		executor.setQueueCapacity(1000);
		return executor;
	}
}