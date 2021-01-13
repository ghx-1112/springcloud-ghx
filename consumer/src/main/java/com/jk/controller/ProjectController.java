package com.jk.controller;

import com.jk.pojo.ProjectBean;
import com.jk.pojo.TreeBean;
import com.jk.service.ProjectService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * @Author: ghx
     * @Description: 导航树查询
     * @Date: 2021/1/12 20:37
      * @param
     * @Return: java.util.List<com.jk.pojo.TreeBean>
     **/
    @RequestMapping("findtree")
    public List<TreeBean> findtree(){
        return projectService.findtree();
    }

    /**
     * @Author: ghx
     * @Description: 项目表分页查询
     * @Date: 2021/1/12 20:39
      * @param page
     * @param rows
     * @param projectBean
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("findProjectPage")
    public HashMap<String,Object> findProjectPage(Integer page, Integer rows, ProjectBean projectBean){
        return projectService.findProjectPage(page,rows,projectBean);
    }

    /**
     * @Author: ghx
     * @Description: 新增项目
     * @Date: 2021/1/13 19:08
      * @param projectBean
     * @Return: void
     **/
    @RequestMapping("addProject")
    public void addProject(ProjectBean projectBean){
        projectService.addProject(projectBean);
    }


}
