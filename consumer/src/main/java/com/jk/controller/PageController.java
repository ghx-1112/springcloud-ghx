package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    /**
     * @Author: ghx
     * @Description: 项目管理页面
     * @Date: 2021/1/13 11:30
      * @param
     * @Return: java.lang.String
     **/
    @RequestMapping("projectshow")
    public String page(){
        return "project/projectshow";
    }
    /**
     * @Author: ghx
     * @Description: 新增项目页面
     * @Date: 2021/1/13 16:46
      * @param
     * @Return: java.lang.String
     **/
    @RequestMapping("toproadd")
    public String toproadd(Integer proid,Model model){
        model.addAttribute("proid",proid);
        return "project/proadd";
    }
    /**
     * @Author: ghx
     * @Description: 阶段计划页面
     * @Date: 2021/1/13 16:47
      * @param
     * @Return: java.lang.String
     **/
    @RequestMapping("toaddstage")
    public String addstage(){
        return "project/addstage";
    }

    /**
     * @Author: ghx
     * @Description: 项目详情页
     * @Date: 2021/1/13 19:58
      * @param
     * @Return: java.lang.String
     **/
    @RequestMapping("toproInfo")
    public String proInfo(Integer proid, Model model){
        model.addAttribute("proid",proid);
        return "project/proInfo";
    }

    /**
     * @Author: ghx
     * @Description: 跳转费用管理列表页面
     * @Date: 2021/1/18 9:45
      * @param
     * @Return: java.lang.String
     **/
    @RequestMapping("toCostshow")
    public String toCostshow(){
        return "cost/costshow";
    }
    /**
     * @Author: ghx
     * @Description: 跳转费用管理新增页面
     * @Date: 2021/1/18 9:46
      * @param
     * @Return: java.lang.String
     **/
    @RequestMapping("toCostadd")
    public String toCostadd(Integer id,Model model){
        return "cost/addcost";
    }

    /**
     * @Author: ghx
     * @Description: 跳转费用详情页面
     * @Date: 2021/1/18 11:33
      * @param id
     * @param model
     * @Return: java.lang.String
     **/
    @RequestMapping("toCostInfo")
    public String toCostInfo(String id,Model model){
        model.addAttribute("cid",id);
        return "cost/costInfo";
    }
}
