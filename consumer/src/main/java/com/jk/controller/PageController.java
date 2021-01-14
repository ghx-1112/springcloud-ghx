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
    public String toproadd(){
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
}
