package cn.husx.hu002springnoweb.service.impl;

import cn.husx.hu002springnoweb.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello(String msg) {
        return "Say "+msg+ "!!!";
    }
}
