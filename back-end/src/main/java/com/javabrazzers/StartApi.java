package com.javabrazzers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class StartApi {
    public static void main(String []args){
        SpringApplication.run(StartApi.class);
    }
}
