package com.skyfaith.deppon_order;

import com.skyfaith.deppon_order.entity.ConfigBean;
import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.skyfaith.deppon_order.dao")
@EnableConfigurationProperties({ConfigBean.class})
public class DepponOrderApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(DepponOrderApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DepponOrderApplication.class);
    }
}
