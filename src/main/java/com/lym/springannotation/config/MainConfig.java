package com.lym.springannotation.config;

import com.lym.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 配置类 == 配置文件
 */
@Configuration  //标识这是一个配置类
/** 添加组建扫描和排除规则
    includeFilters
    encludeFilters
    用法相同, 意义相反
 */
@ComponentScan(value = "com.lym.springannotation", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,
//                classes = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
//                classes = {BookService.class})
        @ComponentScan.Filter(type = FilterType.CUSTOM,
                classes = {MyTypeFilter.class})

})
public class MainConfig {

    /**
     * 给容器中注册一个Bean, 类型为返回值的类型, id为方法名
     * @return
     */
    @Bean
    public Person person() {
        return new Person("Altraman",28);
    }
}
