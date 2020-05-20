package com.pinfan.project.work.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.pinfan.common.utils.http.HttpUtils;
import com.pinfan.framework.config.PinFanConfig;
import com.pinfan.framework.config.wxConfig;
import com.pinfan.framework.redis.RedisCache;
import com.pinfan.framework.security.service.SysLoginService;
import com.pinfan.framework.web.controller.BaseController;
import com.pinfan.framework.web.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/wx")
public class WXController extends BaseController {
    @Autowired
    private SysLoginService loginService;
    @Autowired
    private RedisCache redisCache;

    /**
     *

     * @param js
     * @return
     */

    @PostMapping("/login")
    public AjaxResult login(@RequestBody JSONObject js)
    {
        String url=wxConfig.wx_login_url;
        url = String.format(url,wxConfig.app_id,wxConfig.app_secret,js.get("user"));
        AjaxResult ajax = AjaxResult.success();
        String data=HttpUtils.sendGet(url);
        js=JSONObject.parseObject(data);
        //redisCache.setCacheObject(js.getString("openid"),js.get("session_key"));
        ajax.put("code", js);
        return ajax;
    }

}
