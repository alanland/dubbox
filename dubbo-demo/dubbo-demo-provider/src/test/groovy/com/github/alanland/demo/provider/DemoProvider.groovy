package com.github.alanland.demo.provider

import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 *
 * @author 王成义
 * @date 2015-12-22
 */
class DemoProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}