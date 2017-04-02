package cn.xdeveloper.http;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lai_book on 2017/4/2.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public HttpResult jsonErrorHandler() throws Exception {
        HttpResult httpResult = new HttpResult();
        httpResult.setStatus(HttpResult.STATUS_ERROR);
        httpResult.setDesc("Server error!");

        return httpResult;
    }
}
