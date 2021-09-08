package com.hiyoon.actuatormonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class ActuatorMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorMonitorApplication.class, args);
    }

}
