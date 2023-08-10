package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
private TestService testService;
public  testController(TestService testService){
    this.testService=testService;
}
public void testM(){
    testService.test();
}
}
