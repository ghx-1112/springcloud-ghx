package com.jk.service;

import com.jk.pojo.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "provider")
public interface ProjectService {

    @RequestMapping("project/findtree")
    List<TreeBean> findtree();
}
