package com.zyr.smallproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmallProducerApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {

        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        rabbitTemplate.convertAndSend("My_fanoutExchange","",context);

//        String context2 = "hi, i am message 2";
//        System.out.println("Sender : " + context2);
//        rabbitTemplate.convertAndSend("mybootexchange","topic.messages999999999",context2);
    }


}
