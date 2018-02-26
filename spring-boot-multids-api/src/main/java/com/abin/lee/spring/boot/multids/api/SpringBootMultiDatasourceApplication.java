package com.abin.lee.spring.boot.multids.api;

import com.abin.lee.spring.boot.multids.api.datasource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class SpringBootMultiDatasourceApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMultiDatasourceApplication.class, args);
    }
}
