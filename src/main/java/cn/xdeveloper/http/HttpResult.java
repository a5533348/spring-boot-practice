package cn.xdeveloper.http;

/**
 * Created by lai_book on 2017/4/2.
 */
public class HttpResult {

    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_ERROR = 0;

    private int status;
    private Object data;
    private String desc;

    public HttpResult() {
    }

    public HttpResult(int status, Object data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
