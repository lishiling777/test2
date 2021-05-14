package com.lsl.consumer.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfig {

    /**
     * 最少并发策略
     * @return
     */
    @Bean
    public IRule iRule(){
        //return new BestAvailableRule();
        //权重轮询策略
        return new WeightedResponseTimeRule();
    }
}
