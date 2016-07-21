package com.kellonge.demo.spring.cloud.usercenter.task;

import java.util.Map;

import org.springframework.context.ApplicationContext;

/**
 * 处理程序启动时需要运行的程序
 * 
 * @author kellonge
 * @version $Id: StartUpTaskUtil.java, v 0.1 2016年5月4日 下午7:36:22 kellonge Exp $
 */
public class StartUpTaskUtil {

    /**
     * 扫描标示的{@link com.kellonge.demo.spring.cloud.usercenter.task.StartUpTask @StartUpTask}类中的run方法，目标类必须实现java.lang.Runnable接口，否则跳过执行
     * 
     * @param context
     */
    public static void init(ApplicationContext context) {
        if (null == context) {
            throw new NullPointerException("ApplicationContext can't be null");
        }
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(StartUpTask.class);
        for (Object item : beansWithAnnotation.values()) {
            if (item instanceof Runnable) {
                Runnable task = (Runnable) item;
                try {
                    task.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
