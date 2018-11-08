package com.lym.springannotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        /**
         * 获取 IoC 使用的 BeanFactory
         */
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        /**
         * 获取类加载器
         */
        ClassLoader classLoader = context.getClassLoader();
        /**
         * 获取当前环境信息
         */
        Environment environment = context.getEnvironment();
        /**
         * 获取环境注册类
         */
        BeanDefinitionRegistry registry = context.getRegistry();
        if (environment.getProperty("os.name").contains("Windows")) {
            return true;
        } else {
            return false;
        }
    }
}
