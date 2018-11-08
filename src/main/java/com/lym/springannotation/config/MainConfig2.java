package com.lym.springannotation.config;

import com.lym.springannotation.bean.Color;
import com.lym.springannotation.bean.ColorFactoryBean;
import com.lym.springannotation.bean.Person;
import com.lym.springannotation.bean.Red;
import com.lym.springannotation.condition.LinuxCondition;
import com.lym.springannotation.condition.MyImportBeanDefinitionRegistrar;
import com.lym.springannotation.condition.MyImportSelector;
import com.lym.springannotation.condition.WindowsCondition;
import org.springframework.context.annotation.*;

@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

//    @Scope(value = "prototype")
//    @Lazy
//    @Bean("person2")
//    public Person person00() {
//        System.out.println("添加Person...");
//        return new Person("张三", 25);
//    }

    @Bean("bill")
    @Conditional({WindowsCondition.class})
    public Person person01() {
        return new Person("Bill Gates", 60);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02() {
        return new Person("Linus", 50);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
