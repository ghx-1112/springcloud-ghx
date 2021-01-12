package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("findtree")
    public List<TreeBean> findtree(){
        return projectService.findtree();
    }
}
