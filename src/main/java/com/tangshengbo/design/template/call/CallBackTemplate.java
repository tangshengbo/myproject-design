package com.tangshengbo.design.template.call;


import jodd.util.ThreadUtil;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * Created by Tangshengbo on 2018/4/12.
 */
public class CallBackTemplate {

    private static final Logger logger = LoggerFactory.getLogger(CallBackTemplate.class);

    private int retryCount;

    private int currentRetryCount;

    private Throwable lastThrowable;

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getCurrentRetryCount() {
        return currentRetryCount;
    }

    public <T, E extends Throwable> T execute(CallBack<T, E> callBack) throws E {
        T t = null;
        while (canRetry()) {
            preProcess();
            try {
                t = callBack.doProcess(() -> "糖果");
            } catch (Exception e) {
                logger.info(ExceptionUtils.getStackTrace(e));
                logger.info("出现异常：重试第{}次", getCurrentRetryCount() + 1);
                registerException(e);
            } finally {
                postProcess();
            }
        }
        if (Objects.nonNull(lastThrowable)) {
            throw (E)lastThrowable;
        }
        return t;
    }

    private void registerException(Exception e) {
        currentRetryCount++;
        lastThrowable = e;
    }

    private boolean canRetry() {
        return currentRetryCount < retryCount;
    }

    private void preProcess() {
        logger.info("preProcess...........");
        ThreadUtil.sleep(2000);
    }

    private void postProcess() {
        logger.info("postProcess...........");
        ThreadUtil.sleep(2000);
    }
}
