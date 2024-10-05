package com.example.tests.mt.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Async
    public void calcCommission(Integer sum) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(sum * 0.05f);
    }
}
