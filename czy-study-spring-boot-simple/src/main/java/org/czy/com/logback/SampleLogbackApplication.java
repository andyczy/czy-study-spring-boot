package org.czy.com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther 陈郑游
 * @create 2017/5/8 0008
 * @功能  logback的使用
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */

@RestController
public class SampleLogbackApplication {

    private final static Logger logger = LoggerFactory.getLogger(SampleLogbackApplication.class);

    // http://localhost:8080/czy/logback
    @RequestMapping("/logback")
    public String getLogback() {
        logger.info("logback 访问hello");
        logger.error("logback 访问hello");
        return "Hello logback!";
    }
}
