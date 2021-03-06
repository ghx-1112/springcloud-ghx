package com.jk.controller;

import com.jk.pojo.ProjectBean;
import com.jk.pojo.StageBean;
import com.jk.pojo.TreeBean;
import com.jk.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
     * @Description: 生产者 导航树查询
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
     * @Description: 生产者 项目表分页查询
     * @Date: 2021/1/12 20:39
     * @param page
     * @param rows
     * @param projectBean
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("findProjectPage")
    public HashMap<String,Object> findProjectPage(Integer page, Integer rows,@RequestBody ProjectBean projectBean){
        return projectService.findProjectPage(page,rows,projectBean);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 新增项目
     * @Date: 2021/1/13 19:10
      * @param projectBean
     * @Return: void
     **/
    @RequestMapping("addProject")
    public void addProject(@RequestBody ProjectBean projectBean){
        projectService.addProject(projectBean);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 根据id查询项目详情
     * @Date: 2021/1/14 11:28
      * @param
     * @Return: java.util.List<com.jk.pojo.ProjectBean>
     **/
    @RequestMapping("findProjectById")
    public ProjectBean findProjectById(Integer proid){
        return projectService.findProjectById(proid);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 根据项目id查询阶段计划表
     * @Date: 2021/1/14 14:02
      * @param proid
     * @Return: java.util.List<com.jk.pojo.StageBean>
     **/
    @RequestMapping("findStageByProId")
    public List<StageBean> findStageByProId(Integer proid){
        return projectService.findStageByProId(proid);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 删除项目信息及关联的阶段表
     * @Date: 2021/1/14 14:35
      * @param proid
     * @Return: void
     **/
    @RequestMapping("delProByProId")
    public void delProByProId(Integer proid){
        projectService.delProByProId(proid);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 修改阶段信息 回显
     * @Date: 2021/1/14 17:26
      * @param id
     * @Return: com.jk.pojo.StageBean
     **/
    @RequestMapping("findStageById")
    public StageBean findStageById(Integer id){
        return projectService.findStageById(id);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 保存阶段信息
     * @Date: 2021/1/14 19:28
     * @param stageBean
     * @Return: void
     **/
    @RequestMapping("upStageById")
    public void upStageById(@RequestBody StageBean stageBean){
        projectService.upStageById(stageBean);
    }

    /**
     * @Author: ghx
     * @Description: 生产者 根据id删除阶段计划表
     * @Date: 2021/1/14 19:40
     * @param id
     * @Return: void
     **/
    @RequestMapping("delStageById")
    public void delStageById(Integer id){
        projectService.delStageById(id);
    }
}
