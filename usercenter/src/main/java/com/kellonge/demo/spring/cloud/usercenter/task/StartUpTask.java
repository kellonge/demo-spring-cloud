package com.kellonge.demo.spring.cloud.usercenter.task;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * 标记类中的run方法在程序启动的时候执行，标记的类需要实现java.lang.Runnable接口
 * 
 * @author kellonge
 * @version $Id: StartUpTask.java, v 0.1 2016年5月4日 下午7:27:08 kellonge Exp $
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface StartUpTask {

}
