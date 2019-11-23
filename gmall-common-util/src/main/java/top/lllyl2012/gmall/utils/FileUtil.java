package top.lllyl2012.gmall.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUtil {
    public static String saveFile(byte[] data, String suffix) {
        String fileName = PropertyUtil.getConfig("file_path") + File.separator + UUID.randomUUID().toString()+suffix;
        File file = new File(fileName);
        try {
            FileUtils.writeByteArrayToFile(file,data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    public static byte[] readFile(String path) {
        try {
            return FileUtils.readFileToByteArray(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        saveFile("123".getBytes(), ".txt");
    }
}
