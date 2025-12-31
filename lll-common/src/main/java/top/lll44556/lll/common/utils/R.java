package top.lll44556.lll.common.utils;

import lombok.Data;
import top.lll44556.lll.common.response.RCodeEnum;


@Data
public class R<T> {
    private Boolean ok;
    private Integer code;
    private String msg;
    private T data;

    private R(Boolean ok, Integer code, String msg, T data) {
        this.ok = ok;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> R<T> build(Boolean ok, RCodeEnum codeEnum, T data) {
        return new R<>(ok, codeEnum.getCode(), codeEnum.getMessage(), data);
    }

    public static <T> R<T> build(Boolean ok, RCodeEnum codeEnum, String message, T data) {
        return new R<>(ok, codeEnum.getCode(), message, data);
    }

    public static <T> R<T> ok() {
        return build(true, RCodeEnum.OK, null);
    }

    public static <T> R<T> ok(T data) {
        return build(true, RCodeEnum.OK, data);
    }

    public static <T> R<T> error() {
        return build(false, RCodeEnum.INTERNAL_SERVER_ERROR, null);
    }

    public static <T> R<T> error(RCodeEnum codeEnum) {
        return build(false, codeEnum,null);
    }

    public static <T> R<T> error(String message) {
        return build(false, RCodeEnum.INTERNAL_SERVER_ERROR, message, null);
    }

    public static <T> R<T> error(RCodeEnum codeEnum, String message) {
        return build(false, codeEnum, message, null);
    }


    @Override
    public String toString() {
        return "R{" +
                "ok=" + ok +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
