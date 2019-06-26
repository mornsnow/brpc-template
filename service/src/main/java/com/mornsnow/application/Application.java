package com.mornsnow.application;

import com.mornsnow.starter.log.QcLoggable;
import com.brpc.client.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableEurekaClient
@ComponentScan({"com.brpc.client", "com.mornsnow"})
@ImportResource({"classpath*:brpc.xml", "classpath*:mornsnow-*.xml", "classpath*:datasource.xml",})
@SpringBootApplication
public class Application {

    @QcLoggable(QcLoggable.Type.NONE)
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setRegisterShutdownHook(false);
        app.run(args);
    }
}
