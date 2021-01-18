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
    /**
     * @Author: ghx
     * @Description: 新增账单
     * @Date: 2021/1/18 10:24
      * @param costBean
     * @Return: void
     **/
    @RequestMapping("addCost")
    public void addCost(CostBean costBean){
        costService.addCost(costBean);
    }
    /**
     * @Author: ghx
     * @Description: 根据id查询费用详情
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
     * @Description: 完成报销
     * @Date: 2021/1/18 14:13
      * @param id
     * @Return: void
     **/
    @RequestMapping("accomplish")
    public void accomplish(String id){
        costService.accomplish(id);
    }
}
