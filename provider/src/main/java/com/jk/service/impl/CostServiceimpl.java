package com.jk.service.impl;

import com.jk.dao.CostDao;
import com.jk.pojo.CostBean;
import com.jk.service.CostService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import java.util.HashMap;
import java.util.List;

@Service
public class CostServiceimpl implements CostService {

    @Autowired
    private CostDao costDao;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public HashMap<String, Object> findCostPage(Integer page, Integer rows, CostBean costBean) {
        Query query = new Query();

        if(!StringUtils.isEmpty(costBean.getName())){
            query.addCriteria(Criteria.where("name").in(costBean.getName()));
        }
        if(costBean.getStatus()!=null){
            query.addCriteria(Criteria.where("status").is(costBean.getStatus()));
        }

        long total  = mongoTemplate.count(query, CostBean.class);
        int start = (page-1)*rows;

        Sort orders =Sort.by(new Sort.Order(Sort.Direction.DESC,"date"));
        query.with(orders);

        query.skip(start).limit(rows);
        List<CostBean> list = mongoTemplate.find(query, CostBean.class);
        HashMap<String, Object> map=new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }
}
