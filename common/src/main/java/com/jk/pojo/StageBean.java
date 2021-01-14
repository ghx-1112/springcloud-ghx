package com.jk.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class StageBean {
    private Integer id;
    private String stage;  //阶段
    private String stadate;//开始日期
    private String completion;//完成日期
    private String seeto;  //阶段负责人
    private Integer proid;  //项目id

}
