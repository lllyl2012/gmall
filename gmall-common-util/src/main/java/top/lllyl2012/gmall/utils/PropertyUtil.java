package top.lllyl2012.gmall.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
    public static String getConfig(String key) {
        InputStream path = FileUtil.class.getResourceAsStream("/util.properties");
        Properties properties = new Properties();
        try {
            properties.load(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}
