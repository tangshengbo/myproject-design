package com.tangshengbo.design.factory.name;

/**
 * Created by TangShengBo on 2018/1/6.
 */
public class LLFileName implements FileName {

    @Override
    public String getFileName(String date) {
        return date + "LL";
    }
}
