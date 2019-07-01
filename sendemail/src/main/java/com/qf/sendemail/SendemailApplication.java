package com.qf.sendemail;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@DubboComponentScan("com.qf.serviceimpl")
public class SendemailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendemailApplication.class, args);
    }

}
