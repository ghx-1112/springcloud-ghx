package com.jk.service;

import com.jk.pojo.CostBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@FeignClient(value = "provider")
public interface CostService {

    @RequestMapping("cost/findCostPage")
    HashMap<String, Object> findCostPage(@RequestParam Integer page,@RequestParam Integer rows, CostBean costBean);
}
