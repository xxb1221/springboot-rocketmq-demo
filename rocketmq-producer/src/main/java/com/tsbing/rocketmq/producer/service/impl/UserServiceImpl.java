package com.tsbing.rocketmq.producer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.tsbing.rocketmq.common.User;
import com.tsbing.rocketmq.producer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Value("${rocketmq.topic}")
    private String userTopic;

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送用户信息
     *
     * @return
     */
    @Override
    public Boolean sendUserMsg() {
        User user = new User();
        user.setId(1);
        user.setUsername("test-usernam");
        user.setPassword("test-password");
        rocketMQTemplate.convertAndSend(userTopic, JSONObject.toJSONString(user));
        log.info("已发送");
        return Boolean.TRUE;
    }
}
