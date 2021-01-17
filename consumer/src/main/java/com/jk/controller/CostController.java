package com.jk.controller;

import com.jk.pojo.CostBean;
import com.jk.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("cost")
public class CostController {


    @Autowired
    private CostService costService;


    /**
     * @Author: ghx
     * @Description: 费用管理分页查询
     * @Date: 2021/1/17 18:59
      * @param page
     * @param rows
     * @param costBean
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("findCostPage")
    public HashMap<String,Object> findCostPage(Integer page, Integer rows, CostBean costBean){
        return costService.findCostPage(page,rows,costBean);
    }
}
