package com.dubbo.main;  
  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  

  
public class CustomerMain {  
    public static void main(String[] args) throws InterruptedException{  
        ClassPathXmlApplicationContext cfig = new ClassPathXmlApplicationContext("com/dubbo/config/ApplicationContextCustomer.xml");  
        com.productor.service.DubboProductorTest test = (com.productor.service.DubboProductorTest) cfig.getBean("dubboProvider");  
        System.out.println("消费者调用服务方接口开始");  
        test.sayHello();  
        Thread.sleep(100000);  
        System.out.println("消费者调用服务方接口结束");  
    }  
  
}  
