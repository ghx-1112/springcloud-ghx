package com.jk.service.impl;

import com.jk.dao.ProjectDao;
import com.jk.pojo.ProjectBean;
import com.jk.pojo.StageBean;
import com.jk.pojo.TreeBean;
import com.jk.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProjectServiceimpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    public List<TreeBean> findtree() {
        int pid = 0;
        List<TreeBean> list = fieldnnode(pid);
        return list;
    }

    private List<TreeBean> fieldnnode(int pid) {
        List<TreeBean> list = projectDao.findtree(pid);
        for (TreeBean tree: list) {
            Integer id = tree.getId();
            List<TreeBean> fieldnnode = fieldnnode(id);
            if (fieldnnode!=null&fieldnnode.size()>0){
                tree.setNodes(fieldnnode);
                tree.setSelectable(false);
            }else {
                tree.setSelectable(true);
            }
        }
        return list;
    }

    @Override
    public HashMap<String, Object> findProjectPage(Integer page, Integer rows, ProjectBean projectBean) {
        int total = projectDao.findProjectCount(projectBean);
        int start = (page-1)*rows;
        List<ProjectBean> list = projectDao.findProjectPage(start,rows,projectBean);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }

    @Override
    public void addProject(ProjectBean projectBean) {
        if (projectBean.getProid()!=null){//修改
            projectDao.upProject(projectBean);
        }else {
            projectDao.addProject(projectBean);//新增项目表
            //System.out.println(projectBean);
            projectDao.addProjectStage(projectBean);
        }

    }

    @Override
    public ProjectBean findProjectById(Integer proid) {
        return projectDao.findProjectById(proid);
    }

    @Override
    public List<StageBean> findStageByProId(Integer proid) {
        return projectDao.findStageByProId(proid);
    }

    @Override
    public void delProByProId(Integer proid) {
        projectDao.delProByProId(proid);//删除项目信息
        projectDao.delStageByProId(proid);//删除项目阶段信息
    }

    @Override
    public StageBean findStageById(Integer id) {
        return projectDao.findStageById(id);
    }

    @Override
    public void upStageById(StageBean stageBean) {
        if (stageBean.getId()==null){//新增
            projectDao.addStage(stageBean);
        }else {//修改
            projectDao.upStageById(stageBean);
        }

    }

    @Override
    public void delStageById(Integer id) {
        projectDao.delStageById(id);
    }
}
