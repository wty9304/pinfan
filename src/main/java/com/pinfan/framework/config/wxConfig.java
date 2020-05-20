package com.pinfan.framework.config;

import cn.hutool.setting.dialect.Props;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取微信相关配置
 *
 * @author pinfan
 */

public class wxConfig {
    private static Props props = new Props("wei-xin.properties", "utf-8");

    public static  String app_id = props.getStr("app_id");
    public static  String app_secret = props.getStr("app_secret");

    public static String wx_login_url = props.getStr("wx_login_url");




}
