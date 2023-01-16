//package cn.husx.hu002springnoweb;
//
//import cn.husx.hu002springnoweb.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//@SpringBootApplication
//public class Hu002SpringNowebApplication {
//
//	/**
//	 * 方式一
//	 * @param args
//	 */
//	public static void main(String[] args) {
//
//		/**
//		 * SpringBoot程序启动后，返回值是ConfigurableApplicationContext，它也是一个Spring容器
//		 * 它其实相当于原来Spring容器中的ClasspathXmlApplicationContext
//		 */
//		//获取SpringBoot容器
//		ConfigurableApplicationContext applicationContext=SpringApplication.run(Hu002SpringNowebApplication.class, args);
//
//		//从Spring容器中获取指定的对象
//		StudentService studentService= (StudentService) applicationContext.getBean("studentServiceImpl");
//
//		//调用业务方法
//		String str=studentService.sayHello("noweb");
//		System.out.println("str = " + str);
//	}
//
//
//
//
//}
