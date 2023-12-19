package com.tutorial.apidemo.springboot.tutorial.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
public class JPAconfig {
//    @Bean
//    public OpenAPI customOpenAPI() {
//
//        return new OpenAPI()
//                .info(new Info().title("OGANI REST API DOCUMENT")
//                        .contact(new Contact().name("Dương Tuấn Phương").email("duongtuanphuong2@gmail.com").url("https://www.facebook.com/phuong.ef"))
//                        .termsOfService("http://swagger.io/terms/")
//                        .license(new License().name("Apache 2.0")
//                                .url("http://springdoc.org")));
//    }
}
