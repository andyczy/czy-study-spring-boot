package org.czy.com.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @auther 陈郑游
 * @时间 2017/5/11 0011
 * @功能
 * @问题
 * @博客地址：http://blog.csdn.net/javawebrookie
 * @GitHub地址：https://github.com/AndyCZY
 * @GitBook地址：https://www.gitbook.com/@chenzhengyou
 */
@EnableConfigurationProperties
public class SampleActuatorApplication {

    @Bean
    public HealthIndicator helloHealthIndicator() {
        return new HealthIndicator() {
            @Override
            public Health health() {
                return Health.up().withDetail("hello", "world").build();
            }
        };
    }
}
