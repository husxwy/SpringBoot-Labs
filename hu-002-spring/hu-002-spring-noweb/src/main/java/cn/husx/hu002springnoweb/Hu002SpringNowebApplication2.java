package cn.husx.hu002springnoweb;

import cn.husx.hu002springnoweb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// implements CommandLineRunner
public class Hu002SpringNowebApplication2 implements CommandLineRunner {

//	方式二
	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(Hu002SpringNowebApplication2.class, args);
	}

	//重写CommandLineRunner接口中的run方法
	@Override
	public void run(String... args) throws Exception {
		//调用业务方法
		String str = studentService.sayHello("SpringBoot");
		System.out.println("str = " + str);
	}


}
