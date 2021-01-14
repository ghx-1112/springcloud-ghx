package com.jk.service;

import com.jk.pojo.ProjectBean;
import com.jk.pojo.StageBean;
import com.jk.pojo.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@FeignClient(value = "provider")
public interface ProjectService {

    @RequestMapping("project/findtree")
    List<TreeBean> findtree();

    @RequestMapping("project/findProjectPage")
    HashMap<String, Object> findProjectPage(@RequestParam Integer page,@RequestParam Integer rows, ProjectBean projectBean);

    @RequestMapping("project/addProject")
    void addProject(ProjectBean projectBean);

    @RequestMapping("project/findProjectById")
    ProjectBean findProjectById(@RequestParam Integer proid);

    @RequestMapping("project/findStageByProId")
    List<StageBean> findStageByProId(@RequestParam Integer proid);
}
