package org.example;// Main  Class
// File: src/main/java/org/example/Main.java

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // Basic test endpoint
    @GetMapping("/")
    public String home() {
        return "Hello from Oracle Cloud! Spring Boot is running successfully! 🚀";
    }

    // Health check endpoint
    @GetMapping("/health")
    public String health() {
        return "Application is healthy and running on Oracle Cloud";
    }

    // Test endpoint with parameter
    @GetMapping("/test/{name}")
    public String test(@PathVariable String name) {
        return "Hello " + name + "! Your Spring Boot app is working on Oracle Cloud!";
    }

    // Server info endpoint
    @GetMapping("/info")
    public String info() {
        return String.format(
                "Server Info:\nJava Version: %s\nOS: %s\nServer Time: %s",
                System.getProperty("java.version"),
                System.getProperty("os.name"),
                java.time.LocalDateTime.now()
        );
    }
}
