package com.tangshengbo.design.chain.example;

import org.apache.commons.lang.time.FastDateFormat;

import java.util.Date;

/**
 * Created by Tangshengbo on 2017/9/29.
 * 经理
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    protected void requestApplication(Request request) {
        if ("请假".equals(request.getType()) && request.getNum() <= 2) {
            String processingTime = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date());
            System.out.println(String.format("审批人:%s 内容:%s 数量%s 被批准 审批时间%s", name, request.getContent(),
                    request.getNum(), processingTime));
            return;
        }
        if (superior != null) {
            superior.requestApplication(request);
        }
    }
}
