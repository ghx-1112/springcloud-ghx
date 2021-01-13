package com.jk.pojo;

import lombok.Data;

@Data
public class StageBean {
    private Integer id;
    private Integer stage;  //阶段
    private Integer stadate;//开始日期
    private Integer seeto;  //阶段负责人
    private Integer proid;  //项目id

}
