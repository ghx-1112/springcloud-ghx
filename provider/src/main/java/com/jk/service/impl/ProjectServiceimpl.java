package com.jk.service.impl;

import com.jk.dao.ProjectDao;
import com.jk.pojo.TreeBean;
import com.jk.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
