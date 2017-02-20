package vn.com.fpt.boot.commons.utils;

import org.springframework.context.MessageSource;
import vn.com.fpt.boot.commons.constants.CommonConstants;

import java.util.Locale;

/**
 * Created by VietLK on 2/20/2017.
 */
public class MessageUtils {

    public static String getMessage(MessageSource messageSource, String key, Object[] params, String language) {

        return messageSource.getMessage(key, params,
                language.equals(CommonConstants.LANGUAGE_VN) ?
                        new Locale("vn", "VN") : Locale.US);
    }
}
