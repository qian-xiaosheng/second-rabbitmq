package com.yida.secondrabbitmq;

import com.yida.secondrabbitmq.mq.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecondRabbitmqApplicationTests {
    @Autowired
    private Producer producer;

    @Test
    void contextLoads() {
        producer.send();
    }

}
