package com.yztx.appstore.api;

import com.yztx.appstore.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aw on 2017/8/29.
 */
@Api(value = "CategoryApi", description = "应用分类相关api")
@RestController
@RequestMapping(value = "/api/0/category")
public class CategoryApi {
    @Autowired
    CategoryService categoryService;

    @ApiOperation(value="根据分类id获取明细", notes="根据分类id获取明细")
    @RequestMapping(value="getCategoryList", method= RequestMethod.POST)
    @ResponseBody
    public Map getLanMuDetail(String id){
        Map<String, Object> map = new HashMap<>();
        map.put("data",categoryService.getCategoryList(id));
        return map;
    }
}
