package com.jk.pojo;

import lombok.Data;

import java.util.List;

@Data
public class ProjectBean {
    //项目表：d_project
    private Integer proid;         //主键
    private String pronumber;     //项目编号
    private String proname;       //项目名称
    private String prodescribe;   //项目描述
    private String proprincipal;  //项目负责人

    private String protechlead;     //技术负责人
    private String proproduct;  //产品负责人
    private String protest;     //测试负责人
    private String promarketing;    //市场负责人

    private String procurrent;    //当前阶段
    private Integer prostatus;     //项目状态(1: 进行中,2:已完成，3：已延迟)
    private String prostartdate;  //开始日期
    private String proenddate;   //项目截止日期


    //阶段计划
    private List<StageBean> stageList;
}
