package com.cloud.pojo.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/21 15:21
 **/
@Data
public class User {
    @Id
    private Integer id;

    private String name;
}
