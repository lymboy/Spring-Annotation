package com.lym.springannotation.config;

import com.lym.springannotation.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.lym.springannotation.bean")
@Configuration
public class MainConfigOfLifeCircle {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }
}
