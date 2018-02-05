package com.sx.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xyj
 * @Description:
 * @CreateTime: 2018/1/24 23:19
 * @Version:
 */
@RestController
public class DemoController {

    @ApiOperation("测试swagger")
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String query(){
        return "hehehehe";
    }
}
