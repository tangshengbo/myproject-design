package com.tangshengbo.design.template.call;

/**
 * Created by Tangshengbo on 2018/4/12.
 */
public interface CallBack<T> {

    T doProcess(CallBackContext context) throws Exception;
}
