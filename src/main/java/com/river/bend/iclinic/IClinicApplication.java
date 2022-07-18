package com.river.bend.iclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class IClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(IClinicApplication.class, args);
    }

}
