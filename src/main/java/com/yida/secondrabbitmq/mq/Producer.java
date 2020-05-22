package com.yida.secondrabbitmq.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生产者
 */
@Component
public class Producer {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        try {
            String strDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String msg = "hello 宜达互联["+strDate+"]";
            rabbitTemplate.convertAndSend("test_queue_cluster", msg);//发送
            System.out.println(msg+"，消息发送成功！");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
