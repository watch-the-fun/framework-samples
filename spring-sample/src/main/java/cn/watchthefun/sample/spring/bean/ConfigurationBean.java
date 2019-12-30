package cn.watchthefun.sample.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther geyx
 * @date 2019/12/30
 */
@Configuration
public class ConfigurationBean {
    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }
}
