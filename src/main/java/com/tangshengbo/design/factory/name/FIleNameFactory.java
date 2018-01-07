package com.tangshengbo.design.factory.name;

/**
 * Created by TangShengBo on 2018/1/6.
 */
public class FileNameFactory {

    public static FileName getFileName(String code) {
        FileNameType type = FileNameType.getByCode(code);
        switch (type) {
            case LL:
                return new LLFileName();
            case FY:
                return new FyFileName();
        }
        return null;
    }
}
