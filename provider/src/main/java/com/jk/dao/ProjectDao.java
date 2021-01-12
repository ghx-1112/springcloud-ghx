package com.jk.dao;

import com.jk.pojo.TreeBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProjectDao {
    List<TreeBean> findtree(int pid);
}
