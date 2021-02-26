package cn.personage.common.studys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("API")
@RequestMapping("/test")
public class TestController {

    @ApiOperation("初始化测试接口")
    @PostMapping("/first")
    @ResponseBody
    public Object evaluatePersonage(){


        return "初始化";
    }

}
