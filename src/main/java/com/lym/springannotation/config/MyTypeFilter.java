package com.lym.springannotation.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        /**
         * 获取当前类的注解信息
         */
        final AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        /**
         * 获取当前正在扫描的类的信息
         */
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        String className = classMetadata.getClassName();
        System.out.println("------>"+className);
        /**
         * 获取当前类资源 （类的路径）
         */
        Resource resource = metadataReader.getResource();

        if (className.contains("er")) {
            return true;
        } else {
            return false;
        }
    }
}
