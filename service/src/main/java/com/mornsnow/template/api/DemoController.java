package com.mornsnow.template.api;

import com.mornsnow.common.basic.rest.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangjian on 2017/6/15.
 */

@Api
@RestController
@RequestMapping("/demo")
public class DemoController {

    @ApiOperation(value = "JustDemo")
    @ApiImplicitParams({@ApiImplicitParam()})
    @PostMapping(value = "/Demo")
    public Response<String> demo() {
        return Response.success();
    }

}
