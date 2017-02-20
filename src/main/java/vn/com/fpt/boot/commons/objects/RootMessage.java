package vn.com.fpt.boot.commons.objects;

/**
 * Created by VietLK on 2/20/2017.
 */
public class RootMessage {

    private String code;
    private String msg;

    public RootMessage() {
        super();
    }

    public RootMessage(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
