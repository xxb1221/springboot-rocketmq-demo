package com.tsbing.rocketmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RocketMQMessageListener(topic = "tsbing-test-topic", consumerGroup = "my-consumer-group")
public class UserConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("receive msg " + message);
    }
}
