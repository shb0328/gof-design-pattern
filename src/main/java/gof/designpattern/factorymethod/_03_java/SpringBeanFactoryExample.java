package gof.designpattern.factorymethod._03_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {
    public static void main(String[] args) {
        BeanFactory javaFactory // Creator
                = new AnnotationConfigApplicationContext(Config.class); // ConcreteCreator
        String hi = javaFactory.getBean("hello", String.class); // getBean() : Product - Object
        System.out.println(hi);

        /*
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);
        */
    }

    @Configuration
    public static class Config {
        @Bean
        public String hello() {
            return "hello";
        }
    }

}
