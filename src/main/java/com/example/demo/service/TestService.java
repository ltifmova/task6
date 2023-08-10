package com.example.demo.service;

import com.example.demo.dao.TestDao;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestDao testDao;

    public TestService(TestDao testDao) {
        this.testDao = testDao;
    }
    public void test(){
        System.out.println("salam");
    }
}
