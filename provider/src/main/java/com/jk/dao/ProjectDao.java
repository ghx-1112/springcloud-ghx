package com.jk.dao;

import com.jk.pojo.ProjectBean;
import com.jk.pojo.TreeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProjectDao {
    List<TreeBean> findtree(int pid);

    int findProjectCount(@Param("projectBean") ProjectBean projectBean);

    List<ProjectBean> findProjectPage(@Param("start")int start,@Param("rows") Integer rows,@Param("projectBean") ProjectBean projectBean);

    void addProject(ProjectBean projectBean);
}
