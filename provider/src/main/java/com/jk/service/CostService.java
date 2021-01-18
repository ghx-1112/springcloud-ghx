package com.jk.service;

import com.jk.pojo.CostBean;

import java.util.HashMap;

public interface CostService {

    HashMap<String, Object> findCostPage(Integer page, Integer rows, CostBean costBean);

    void addCost(CostBean costBean);

    CostBean findCostById(String id);

    void accomplish(String id);
}
