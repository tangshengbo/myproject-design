package com.tangshengbo.design.factory.name;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by TangShengBo on 2018/1/6.
 */
public class FactoryTest {

    public static void main(String[] args) {
        FileName fileName = FileNameFactory.getFileName(FileNameType.FY.getCode());
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String name = null;
        if (fileName != null) {
            name = fileName.getFileName(format.format(new Date()));
        }
        System.out.println(name);
    }
}
