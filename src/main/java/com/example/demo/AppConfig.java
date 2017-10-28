package com.example.demo;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({ "com.example"})
public class AppConfig {
	
//    @Bean
//    public LoggingAspect logAspect(){
//    	return new LoggingAspect();
//    }


}
