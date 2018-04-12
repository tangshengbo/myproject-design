package com.tangshengbo.design.template.call;

import jodd.util.ThreadUtil;

/**
 * Created by Tangshengbo on 2018/4/12.
 */
public class CallBackTest {

    public static void main(String[] args) {
        CallBackTemplate backTemplate = new CallBackTemplate();
        String result = backTemplate.execute(context -> {
            System.out.println("实际处理接口。。。。。。。" + context.getName());
            ThreadUtil.sleep(2000);
//            int i = 10 / 0;
            return "Callback";
        });
        System.out.println("返回：" + result);
    }
}
