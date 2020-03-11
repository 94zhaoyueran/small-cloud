package com.zyr.smallconsumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.OutputStream;

/**
 * @author: Administrator
 * @date: 2020-1-19 14:46
 */
@Component
public class ReceiveHandler {

//    @RabbitListener(queues = {"q_topic_message"})
//    public void receive_Msg_01(String msg, Message message, Channel channel){
//        System.out.println("msg01------------"+msg);
////        System.out.println("message01-----------"+message);
////        System.out.println("Channel01-----------"+channel);
//    }
//
//    @RabbitListener(queues = {"q_topic_messages"})
//    public void receive_Msg_02(String msg, Message message, Channel channel){
//        System.out.println("msg02------------"+msg);
////        System.out.println("message02-----------"+message);
////        System.out.println("Channel02-----------"+channel);
//    }

    @RabbitListener(queues = {"queue_A"})
    public void receiveA(String msg, Message message, Channel channel){
        System.out.println("receiveA-----"+msg);
    }

    @RabbitListener(queues = {"queue_B"})
    public void receiveB(String msg, Message message, Channel channel){
        System.out.println("receiveB-----"+msg);
    }

    @RabbitListener(queues = {"queue_C"})
    public void receiveC(String msg, Message message, Channel channel){
        System.out.println("receiveC-----"+msg);
    }

}
