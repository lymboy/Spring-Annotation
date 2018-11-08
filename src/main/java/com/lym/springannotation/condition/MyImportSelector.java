package com.lym.springannotation.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.lym.springannotation.bean.Blue", "com.lym.springannotation.bean.Yellow"};
    }
}
