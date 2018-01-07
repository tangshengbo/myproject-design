package com.tangshengbo.design.factory.name;

/**
 * Created by TangShengBo on 2018/1/6.
 */
public enum FileNameType {

    FY("FY"),
    LL("LL");

    private final String code;

    FileNameType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static FileNameType getByCode(String code) {
        for (FileNameType resultCode : FileNameType.values()) {
            if (resultCode.getCode().equals(code)) {
                return resultCode;
            }
        }
        throw new IllegalArgumentException("没有对应的文件类型:" + code);
    }
}
