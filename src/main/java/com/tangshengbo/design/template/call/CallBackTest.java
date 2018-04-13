package com.tangshengbo.design.template.call;

import jodd.util.ThreadUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Tangshengbo on 2018/4/12.
 */
public class CallBackTest {

    private static final Logger logger = LoggerFactory.getLogger(CallBackTest.class);

    @Test
    public void testCallBackTemplate() {
        CallBackTemplate backTemplate = new CallBackTemplate();
        backTemplate.setRetryCount(3);
        String result = backTemplate.execute(context -> {
            logger.info("执行实际处理接口，{}", context.getName());
            ThreadUtil.sleep(2000);
            int i = 10 / 0;
            return "Callback";
        });
        System.out.println("返回：" + result);

    }
}
