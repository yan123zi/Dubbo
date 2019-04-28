package com.pxxy;

import com.pxxy.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = applicationContext.getBean(OrderService.class);
        bean.initOrder("1");
        System.in.read();
    }
}
