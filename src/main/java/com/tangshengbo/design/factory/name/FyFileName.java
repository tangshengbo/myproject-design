package com.tangshengbo.design.factory.name;

/**
 * Created by TangShengBo on 2018/1/6.
 */
public class FyFileName implements FileName {

    @Override
    public String getFileName(String date) {
        return DEFAULT_SEPARATOR_CHAR + "FY" + JOIN_SIGN + date + TEXT_FILE_SUFFIX;
    }
}
