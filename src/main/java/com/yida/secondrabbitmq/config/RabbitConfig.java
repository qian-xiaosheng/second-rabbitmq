package com.yida.secondrabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Rabbitmq的配置类
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue createQueue() {
        //返回一个持久化queue，其中最前面的test符合rabbitmq集群模式的镜像模式，即：^test
        return new Queue("test_queue_cluster",true,false,false,null);
    }
}
