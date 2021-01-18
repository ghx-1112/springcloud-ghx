package com.jk.controller;

import com.jk.pojo.CostBean;
import com.jk.service.CostService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
     * @Description: 生产者 费用管理分页查询
     * @Date: 2021/1/17 19:04
      * @param page
     * @param rows
     * @param costBean
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("findCostPage")
    public HashMap<String,Object> findCostPage(Integer page, Integer rows,@RequestBody CostBean costBean){
        return costService.findCostPage(page,rows,costBean);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 新增账单
     * @Date: 2021/1/18 10:24
     * @param costBean
     * @Return: void
     **/
    @RequestMapping("addCost")
    public void addCost(@RequestBody CostBean costBean){
        costService.addCost(costBean);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 根据id查询费用详情
     * @Date: 2021/1/18 11:43
     * @param id
     * @Return: com.jk.pojo.CostBean
     **/
    @RequestMapping("findCostById")
    public CostBean findCostById(String id){
        return costService.findCostById(id);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 完成报销
     * @Date: 2021/1/18 14:13
     * @param id
     * @Return: void
     **/
    @RequestMapping("accomplish")
    public void accomplish(String id){
        costService.accomplish(id);
    }
}
