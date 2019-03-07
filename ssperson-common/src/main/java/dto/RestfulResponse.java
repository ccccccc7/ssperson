package dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zyl
 */
@Data
public class RestfulResponse<T> implements Serializable {

    private static final long serialVersionUID = 8906704244975477603L;

    public static final int SUCCESS_CODE = 200;

    public static final String SUCCESS_MESSAGE = "操作成功";

    public static final int ERROR_CODE = 500;

    public static final String ERROR_MESSAGE = "内部异常";


    private int code;

    private String message;

    private T result;

    RestfulResponse(int code, String message, T result) {
        this.message = message;
        this.code = code;
        this.result = result;
    }

    RestfulResponse(int code, String message) {
        this(code, message, null);
    }

    RestfulResponse() {
        this(SUCCESS_CODE, SUCCESS_MESSAGE);
    }
}
