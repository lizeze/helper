package io.github.lizeze.util;

import java.io.FileNotFoundException;

/**
 * @author ：lzz
 * @BelongsProject: io.github.lizeze.util
 * @date ：Created in 2020/10/26 11:15
 * @description ：
 * @modified By：
 */
public class FileUtil {


    /**
     * 获取文件后缀名
     *
     * @param fileName
     * @return
     */
    public static String getFileSuffix(String fileName) {
        if (fileName.lastIndexOf(".") == -1) {
            return null;
        }
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        return suffix;

    }

    /**
     * 获取文件名称
     *
     * @param fileName 文件名称或者文件路径
     * @return 文件名称
     * @throws FileNotFoundException
     */
    public String getFileName(String fileName) throws FileNotFoundException {
        int index = fileName.lastIndexOf("/");
        if (index == -1) {
            index = fileName.lastIndexOf("\\");
        } else {
            if (fileName.indexOf("\\") != -1) {
                throw new FileNotFoundException();
            }
        }

        if (index == -1) {
            index = fileName.lastIndexOf('.');
            if (index == -1) return null;
            return fileName.substring(0, index);
        }
        return fileName.substring(index + 1, fileName.lastIndexOf("."));
    }

}
