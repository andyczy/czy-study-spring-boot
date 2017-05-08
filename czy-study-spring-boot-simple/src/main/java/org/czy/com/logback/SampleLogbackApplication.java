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
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */

@RestController
public class SampleLogbackApplication {


    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * url : http://localhost:8080/czy/logback
     * Success
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/logback")
    @ResponseBody
    public void getLogback(HttpServletResponse response) throws IOException {
        logger.debug("DEBUG TEST 这个地方输出DEBUG级别的日志");
        logger.info("INFO test 这个地方输出INFO级别的日志");
        logger.error("ERROR test 这个地方输出ERROR级别的日志");
    }
}
