package com.example.tests.mt.controller;

import com.example.tests.mt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String getCommission(@RequestParam(value = "sum", required = false) Integer sum) throws InterruptedException {
        taskService.calcCommission(sum);
        return "Считаю, результат скоро будет получен...";
    }
}
