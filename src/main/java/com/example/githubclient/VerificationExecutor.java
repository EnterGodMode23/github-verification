package com.example.githubclient;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class VerificationExecutor {
    @Scheduled(cron = "* * * ? * *")
    public void print(){
        System.out.println("10");
    }
}
