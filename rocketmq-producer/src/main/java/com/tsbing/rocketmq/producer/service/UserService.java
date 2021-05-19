package com.tsbing.rocketmq.producer.service;

public interface UserService {
    /**
     * 发送用户信息
     *
     * @return
     */
    Boolean sendUserMsg();
}
