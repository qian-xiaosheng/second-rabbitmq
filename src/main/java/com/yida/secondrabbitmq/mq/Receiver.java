package com.yida.secondrabbitmq.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收者
 */
@Component
@RabbitListener(queues = {"test_queue_cluster"})
public class Receiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("接收到的信息："+msg);
    }
}
