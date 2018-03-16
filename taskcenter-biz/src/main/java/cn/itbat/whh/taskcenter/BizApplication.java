package cn.itbat.whh.taskcenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动工具类
 * @author huahui.wu.
 *         Created on 2018/3/15.
 */
public class BizApplication {

    public static void main(String[] args) throws InterruptedException{
        Logger logger = LoggerFactory.getLogger(BizApplication.class);

        logger.info(">>>>> spring-boot 正在启动 <<<<<");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        logger.info(">>>>> spring-boot 启动完成 <<<<<");

        Thread.sleep(Long.MAX_VALUE);

    }
}
