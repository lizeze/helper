package io.github.lizeze.util;

import io.github.lizeze.enums.OSType;

import java.io.File;

/**
 * @author ：lzz
 * @BelongsProject: io.github.lizeze.util
 * @date ：Created in 2020/10/26 11:10
 * @description ：
 * @modified By：
 */
public class OSUtil {
    /**
     * 获取操作系统类型
     *
     * @return
     */
    public static OSType getOsType() {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac")) {
            return OSType.Mac;
        } else if (osName.startsWith("Windows")) {
            return OSType.Win;
        } else {
            return OSType.Linux;
        }
    }

    /**
     * 获取当前操作系统下的分隔符
     *
     * @return
     */
    public static String getSeparator() {
        return File.separator;
    }
}
