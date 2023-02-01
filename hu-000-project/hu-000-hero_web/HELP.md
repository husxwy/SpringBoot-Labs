# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#using.devtools)



2023-02-01 09:34:12.432  WARN 92491 --- [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration': Invocation of init method failed; nested exception is org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration': Requested bean is currently in creation: Is there an unresolvable circular reference?

----


Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2023-02-01 09:29:00.687 ERROR 92361 --- [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

The dependencies of some of the beans in the application context form a cycle:

┌──->──┐
|  com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration
└──<-──┘


Action:

Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.


Process finished with exit code 0