package com.tangshengbo.design.template.call;


import jodd.util.ThreadUtil;
import org.apache.commons.lang.exception.ExceptionUtils;

/**
 * Created by Tangshengbo on 2018/4/12.
 */
public class CallBackTemplate {

    public <T> T execute(CallBack<T> callBack) {
        preProcess();
        try {
            return callBack.doProcess(() -> "糖果");
        } catch (Exception e) {
            System.out.println(ExceptionUtils.getStackTrace(e));
        } finally {
            postProcess();
        }
        return null;
    }

    private void preProcess() {
        System.out.println("preProcess...........");
        ThreadUtil.sleep(2000);
    }

    private void postProcess() {
        System.out.println("postProcess...........");
        ThreadUtil.sleep(2000);
    }
}
