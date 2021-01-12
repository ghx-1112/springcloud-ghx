package com.jk.pojo;

import lombok.Data;

import java.util.List;

@Data
public class TreeBean {
    private Integer id;
    private String text;
    private Integer pid;
    private String href;
    private List<TreeBean> nodes;
    private Boolean selectable;
}
