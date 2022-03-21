package io.github.vino42.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * =====================================================================================
 *
 * @Created :   2022/3/21 22:04
 * @Compiler :  jdk 11
 * @Author :    VINO
 * @Email : 38912428@qq.com
 * @Copyright : VINO
 * @Decription :
 * =====================================================================================
 */
@Configuration
public class ActiveMQConfiguration {
    @Autowired
    CustomActiveMqProperties activeMqProperties;

    @Bean
    public ActiveMQQueue myQueueText() {
        return new ActiveMQQueue(activeMqProperties.getMyQueueText());
    }

    @Bean
    public ActiveMQQueue myQueueObj() {
        return new ActiveMQQueue(activeMqProperties.getMyQueueObj());
    }
}
