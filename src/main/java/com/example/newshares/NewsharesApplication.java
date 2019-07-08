package com.example.newshares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTask;

@SpringBootApplication
@EnableScheduling//为定时增加注解
public class NewsharesApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsharesApplication.class, args);
    }
}
