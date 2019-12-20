package com.ustglobal.stockmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ProductConfig {
		@Bean
		public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
			LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
			bean.setPersistenceUnitName("stock-unit");
			return bean;
		}
	}

	
