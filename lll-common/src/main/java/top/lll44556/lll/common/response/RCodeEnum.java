package top.lll44556.lll.common.response;

import lombok.Getter;

@Getter
public enum RCodeEnum {

    OK(200, "请求成功"),
    CREATED(201, "资源已创建"),
    ACCEPTED(202, "请求已接收但尚未处理"),
    NO_CONTENT(204, "无内容"),

    // 3xx - 重定向
    MOVED_PERMANENTLY(301, "资源已永久移动"),
    FOUND(302, "资源临时移动"),
    NOT_MODIFIED(304, "资源未修改"),

    // 4xx - 客户端错误
    BAD_REQUEST(400, "错误的请求"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "未找到资源"),
    METHOD_NOT_ALLOWED(405, "方法不允许"),
    CONFLICT(409, "请求冲突"),
    UNPROCESSABLE_ENTITY(422, "无法处理的实体"),


    LOGIN_PHONE_EMPTY(4001, "手机号码为空"),
    LOGIN_CODE_EMPTY(4002, "验证码为空"),
    SEND_SMS_TOO_OFTEN(4003, "验证码发送过于频繁"),
    LOGIN_CODE_EXPIRED(4004, "验证码已过期"),
    LOGIN_CODE_ERROR(4005, "验证码错误"),
    ACCOUNT_DISABLED_ERROR(4006, "该用户已被禁用"),
    LOGIN_AUTH(4007, "未登陆"),


    // 5xx - 服务器错误
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    NOT_IMPLEMENTED(501, "未实现该功能"),
    SERVICE_UNAVAILABLE(503, "服务不可用");

    ;



    private final Integer code;
    private final String message;

    private RCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
