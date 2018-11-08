package com.lym.springannotation.config;

import com.lym.springannotation.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 自动装配：
 *      Spring 利用依赖注入(DI), 完成对容器中各个组件的依赖关系赋值
 * 1） Autowired 自动注入
 *      默认按照类型去容器中查找对应的组件
 *          applicationContext.getBean(BookService.class);
 * 2) 如果找到多个类型相同的组件， 则按照属性名匹配
 * 3) @Qualifier 指定装配的组建id
 * 4) 自动默认一定要将属性赋好值，没有就报错
 * 5) @Primary
 *      当匹配到多个类型相同的组件时，首选@Primary标记的组件
 *      也可以继续使用@Qualifier("bookDao") 指定需要装配的bean(优先级更高)
 */
@Configuration
@ComponentScan({"com.lym.springannotation.controller", "com.lym.springannotation.service", "com.lym.springannotation.dao"})
public class MainConfigOfAutowired {

    @Primary
    @Bean ("bookDao2")
    public BookDao bookDao() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }
}
