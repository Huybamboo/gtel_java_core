package gtel.com.java_spring.exception;

import gtel.com.java_spring.utils.ERROR_CODE;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class ApplicationException extends RuntimeException {
    private final String code;
    private final Map<String, Object> data;
    private final String title;

    public ApplicationException(ERROR_CODE errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getErrorCode();
        this.title = errorCode.getMessage();
        this.data = new HashMap<>();
    }

    public ApplicationException(ERROR_CODE errorCode, String message) {
        super(message);
        this.code = errorCode.getErrorCode();
        this.title = message;
        this.data = new HashMap<>();
    }

    public ApplicationException(ERROR_CODE errorCode, String message, Map<String, Object> data) {
        super(message);
        this.code = errorCode.getErrorCode();
        this.title = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public String getTitle() {
        return title;
    }
}