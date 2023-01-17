package cn.iocoder.springboot.labs.lab05.undertow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "world undertow";
    }

    @GetMapping("/sleep")
    public String sleep() throws InterruptedException {
        Thread.sleep(1000L);
        Thread.sleep(1000L);
        return "sleep";
    }

}
