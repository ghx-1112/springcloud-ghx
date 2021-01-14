package com.jk.service;

import com.jk.pojo.ProjectBean;
import com.jk.pojo.StageBean;
import com.jk.pojo.TreeBean;

import java.util.HashMap;
import java.util.List;

public interface ProjectService {

    List<TreeBean> findtree();

    HashMap<String, Object> findProjectPage(Integer page, Integer rows, ProjectBean projectBean);

    void addProject(ProjectBean projectBean);

    ProjectBean findProjectById(Integer proid);

    List<StageBean> findStageByProId(Integer proid);

    void delProByProId(Integer proid);

    StageBean findStageById(Integer id);
}
