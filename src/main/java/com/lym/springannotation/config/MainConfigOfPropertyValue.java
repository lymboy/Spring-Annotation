package com.lym.springannotation.config;

import com.lym.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
/**
 * 使用@PropertySource读取外部配置文件K/V保存到运行环境变量中
 * 加载完后可以使用${}表达式取出
 */
@PropertySource(value = {"classpath:person.properties"})
public class MainConfigOfPropertyValue {

    @Bean
    public Person person() {
        return new Person();
    }
}
