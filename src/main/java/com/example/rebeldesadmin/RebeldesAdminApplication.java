package com.example.rebeldesadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class RebeldesAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(RebeldesAdminApplication.class, args);
    }

}
