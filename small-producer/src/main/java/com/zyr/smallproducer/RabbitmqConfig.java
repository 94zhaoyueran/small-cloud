package com.zyr.smallproducer;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Administrator
 * @date: 2020-1-19 14:00
 */
@Configuration
public class RabbitmqConfig {

    private static final String messageA = "queue_A";

    private static final String messageB = "queue_B";

    private static final String messageC = "queue_C";

    @Bean
    public Queue queueMessageA() {
        return new Queue(messageA);
    }

    @Bean
    public Queue queueMessagesB() {
        return new Queue(messageB);
    }

    @Bean
    public Queue queueMessagesC() {
        return new Queue(messageC);
    }

//    @Bean
//    TopicExchange topicExchange(){
//        return new TopicExchange("mybootexchange");
//    }

    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("My_fanoutExchange");
    }

    @Bean
    Binding bindingExchangeA(@Qualifier("queueMessageA")Queue queueMessageA, @Qualifier("fanoutExchange") FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueMessageA).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeMessageB(@Qualifier("queueMessagesB")Queue queueMessagesB, @Qualifier("fanoutExchange") FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queueMessagesB).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeMessageC(@Qualifier("queueMessagesC") Queue queueMessagesC, @Qualifier("fanoutExchange") FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queueMessagesC).to(fanoutExchange);
    }

}
