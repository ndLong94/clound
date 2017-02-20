package vn.com.fpt.boot.commons.utils;

import vn.com.fpt.boot.commons.constants.CommonConstants;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by VietLK on 2/20/2017.
 */
public class RandomUtils {

    public static String generateRandomString(int seqCount) {

        String result = CommonConstants.EMPTY_STRING;
        Boolean firstPass = Boolean.TRUE;

        for(int i = 0 ; i < seqCount ; i++) {
            SecureRandom random = new SecureRandom();
            String sequence = new BigInteger(130, random).toString(32);
            if(firstPass) {
                firstPass = Boolean.FALSE;
                result += sequence;
            } else {
                result += CommonConstants.HYPHEN_STRING + sequence;
            }
        }

        return result;
    }
}
