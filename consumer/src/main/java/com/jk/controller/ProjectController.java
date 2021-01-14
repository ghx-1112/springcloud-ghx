package com.jk.controller;

import com.jk.pojo.ProjectBean;
import com.jk.pojo.StageBean;
import com.jk.pojo.TreeBean;
import com.jk.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    /**
     * @Author: ghx
     * @Description: 根据id查询项目详情
     * @Date: 2021/1/14 11:26
      * @param proid
     * @Return: java.util.List<com.jk.pojo.ProjectBean>
     **/
    @RequestMapping("findProjectById")
    public ProjectBean findProjectById(Integer proid){
        return projectService.findProjectById(proid);
    }

    /**
     * @Author: ghx
     * @Description: 根据项目id查询阶段计划表
     * @Date: 2021/1/14 14:01
      * @param
     * @Return: java.util.List<com.jk.pojo.StageBean>
     **/
    @RequestMapping("findStageByProId")
    public List<StageBean> findStageByProId(Integer proid){
        return projectService.findStageByProId(proid);
    }

    /**
     * @Author: ghx
     * @Description: 删除项目信息及关联的阶段表
     * @Date: 2021/1/14 14:32
      * @param proid
     * @Return: void
     **/
    @RequestMapping("delProByProId")
    public void delProByProId(Integer proid){
        projectService.delProByProId(proid);
    }

    /**
     * @Author: ghx
     * @Description: 修改阶段信息 回显
     * @Date: 2021/1/14 17:25
      * @param
     * @Return: com.jk.pojo.StageBean
     **/
    @RequestMapping("findStageById")
    public StageBean findStageById(Integer id){
        return projectService.findStageById(id);
    }
}
