package com.pinfan;

import com.pinfan.common.utils.ip.IpUtils;
import com.pinfan.framework.config.PinFanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 启动程序
 *
 * @author pinfan
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PinFanApplication
{
    public static void main(String[] args)
    {
//        System.setProperty("spring.devtools.restart.enabled", "false");
        ConfigurableApplicationContext context = SpringApplication.run(PinFanApplication.class, args);
        printKeyLoadMessage(context);
    }

    /**
     * 获取Key加载信息
     */
    public static boolean printKeyLoadMessage( ConfigurableApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();
        // 项目端口
        String port = environment.getProperty("server.port");
        // 项目路径
        String contextPath = environment.getProperty("server.servlet.context-path");

        String homeUrl = "http://" + IpUtils.getHostIp() + ":" + port + contextPath;
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n======================================================================\r\n");
        sb.append("\r\n            (♥◠‿◠)ﾉﾞ  w启动成功   ლ(´ڡ`ლ)ﾞ  \r\n");
        sb.append("\r\n======================================================================\r\n");
        System.out.println(sb.toString());
        System.out.println("\thomeUrl:    " + homeUrl);
        return true;
    }
}
