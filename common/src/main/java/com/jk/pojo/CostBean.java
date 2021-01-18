package com.jk.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Document(collection="t_cost")
public class CostBean {
    private String id;
    private Integer type;   //报销类型
    private Integer money;  //金额（元）
    private String name;   //报销人
    private Integer status; //状态(1: 未报销,2:已报销)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date date;   // 报销日期
    private String info;    //报销说明
}
