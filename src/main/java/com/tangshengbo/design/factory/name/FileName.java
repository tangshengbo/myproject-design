package com.tangshengbo.design.factory.name;

/**
 * Created by TangShengBo on 2018/1/6.
 */
public interface FileName {

    String JOIN_SIGN = "_";

    String TEXT_FILE_SUFFIX = ".txt";

    String CSV_FILE_SUFFIX = ".csv";

    String DEFAULT_SEPARATOR_CHAR = "/";

    String getFileName(String date);
}
