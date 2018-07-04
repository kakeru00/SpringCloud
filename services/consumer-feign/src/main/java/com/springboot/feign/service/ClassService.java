package com.springboot.feign.service;

import com.springboot.cloud.common.core.entity.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "producer", fallback = ClassServiceFallback.class)
public interface ClassService {

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    Result users(@RequestParam("name") String name);

    @RequestMapping(value = "/product/", method = RequestMethod.POST)
    Result users(@RequestBody Map map);
}
