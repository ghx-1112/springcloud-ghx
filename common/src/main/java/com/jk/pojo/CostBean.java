package com.jk.pojo;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection="t_cost")
public class CostBean {
    private String id;
    private Integer type;   //报销类型
    private Integer money;  //金额（元）
    private String name;   //报销人
    private Integer status; //状态(1: 未报销,2:已报销)
    private Date date;   // 报销日期

}
