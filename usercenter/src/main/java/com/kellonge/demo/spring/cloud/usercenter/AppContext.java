package com.kellonge.demo.spring.cloud.usercenter;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AppContext implements ApplicationContextAware {

    private static ApplicationContext context;

    public static <T> T getBean(Class<T> paramClass) {
        return context.getBean(paramClass);
    }

    public void setApplicationContext(ApplicationContext paramApplicationContext) throws BeansException {
        context = paramApplicationContext;

    }
}
