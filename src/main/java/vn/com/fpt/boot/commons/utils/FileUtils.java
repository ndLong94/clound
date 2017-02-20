package vn.com.fpt.boot.commons.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by VietLK on 2/20/2017.
 */
public class FileUtils {

    public static Properties load(String resource) {
        Properties props = new Properties();

        InputStream inStream = FileUtils.class.getClassLoader().getResourceAsStream(resource);

        try {

            props.load(inStream);

        } catch(FileNotFoundException fnfex) {


        } catch(IOException ioex) {


        }

        return props;

    }
}
