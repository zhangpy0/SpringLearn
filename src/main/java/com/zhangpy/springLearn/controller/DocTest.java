package com.zhangpy.springLearn.controller;


import com.zhangpy.springLearn.bean.JsonResult;
import com.zhangpy.springLearn.bean.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "操作接口", description = "操作描述")
@RestController
@RequestMapping("/doc")
public class DocTest {

    @Operation(summary = "测试接口", description = "测试描述")
    @Parameters(
            {
                @Parameter(name = "id", description = "id描述", required = true),
                @Parameter(name = "username", description = "username描述", required = true),
                @Parameter(name = "password", description = "password描述", required = true),
                @Parameter(name = "email", description = "email描述", required = true)
            }
    )
    @RequestMapping(value = "/form",produces = "application/json;charset=UTF-8",method = RequestMethod.POST)
    public JsonResult<Object> getForm(@RequestBody User user){
        return new JsonResult<Object>(0,"success",user);
    }
}
