package com.example.jmhtest;

import com.example.jmhtest.controller.OrderController;
import com.example.jmhtest.controller.UserController;
import com.example.jmhtest.util.OrderUtil;
import com.example.jmhtest.util.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author whx
 * @date 2022/7/22
 */
//测试模式： Throughput（吞吐量），
//        AverageTime（平均时间），
//        SampleTime（在测试中，随机进行采样执行的时间），
//        SingleShotTime（在每次执行中计算耗时），All
@BenchmarkMode(Mode.All)
//预热 ：iterations次数，time时间 单位秒
@Warmup(iterations = 1, time = 3)
//方法调用多少次，多少时间 单位秒
@Measurement(iterations = 1, time = 3)
@Threads(4)
//用多少线程进行执行
@Fork(1)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.SECONDS)
@Slf4j
public class JMHTest {

    private final AnnotationConfigApplicationContext annotationConfigApplicationContext;
    private final UserController userController;
    private final OrderController orderController;
    private final UserUtil userUtil;

    public JMHTest() {
        // 获取bean
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        userController = annotationConfigApplicationContext.getBean("userController", UserController.class);
        orderController = annotationConfigApplicationContext.getBean("orderController", OrderController.class);
        userUtil = annotationConfigApplicationContext.getBean("userUtil", UserUtil.class);
    }

    @TearDown
    public void close() {
        // 关闭资源
        annotationConfigApplicationContext.close();
    }

    @Benchmark
    public void userTest() {
        // 测试接口1
        userController.list();
    }

    //用于声明是测试
    @Benchmark
    public void orderTest() {
        // 测试接口2
        orderController.list();
    }

    @Benchmark
    public void userUtilTest() {
        // 测试非静态方法
        userUtil.list();
    }

    @Benchmark
    public void orderUtilTest() {
        // 测试静态方法
        OrderUtil.list();
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(JMHTest.class.getSimpleName())
                // 以json格式将测试结果数据保存到指定文件中，该结果还无法直接查看，需要导入到https://jmh.morethan.io/网站中查看
                .result("jmh-result.json")
                .resultFormat(ResultFormatType.JSON)
                .build();
        new Runner(options).run();
    }

}
