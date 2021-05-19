package com.tsbing.rocketmq.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户名字
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
