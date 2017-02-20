package vn.com.fpt.boot.commons.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import vn.com.fpt.boot.commons.constants.CommonConstants;

/**
 * Created by VietLK on 2/20/2017.
 */
public class JacksonUtils {

    public static String java2Json(Object object) {

        ObjectMapper mapper = new ObjectMapper();
        String json = CommonConstants.EMPTY_STRING;
        try {
            json = mapper.writeValueAsString(object);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        } finally {

        }

        return json;
    }

}
