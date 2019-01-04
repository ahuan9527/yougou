package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @Description:    描述
* @Author:         AHUAN
* @CreateDate:     2019/1/2 0002 下午 11:18
* @UpdateUser:     AHUAN
* @UpdateDate:     2019/1/2 0002 下午 11:18
* @content:         测试调用服务成方法
* <p>localhost:ahuan.com</p>
* @Version:        1.0
*/

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/queryNow")
    @ResponseBody
    public String queryNow(){
        return testService.queryNow();
    }
}
