package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("findtree")
    @ResponseBody
    public List<TreeBean> findtree(){
        return projectService.findtree();
    }
}
