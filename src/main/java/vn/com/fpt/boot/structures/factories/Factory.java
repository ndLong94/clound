package vn.com.fpt.boot.structures.factories;

/**
 * Created by VietLK on 2/20/2017.
 */
public interface Factory {

    Object produce(String key, String lang);
}
