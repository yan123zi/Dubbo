package com.pxxy.bootuserserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

/**
 * 导入dubbo的starter
 * springboot与dubbo整合的三种方式
 * 1，导入dubbo-starter，在application-properties中配置属性，使用@Service暴露服务和使用@Reference来引用服务
 * 2，保留dubbo的xml配置文件；
 *      导入dubbo-starter，使用@ImportResource导入dubbo的配置文件即可
 * 3,使用注解api的方式：
 *      将每一个组件手动创建到容器中,让dubbo扫描组件即可
 */
//@ImportResource("classpath:provider.xml")
@EnableDubbo    //开启基于注解的dubbo
@EnableHystrix //开启服务容错
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
