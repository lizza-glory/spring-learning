package com.lizza.auto.injection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class Result<T> {

    public static final Long SUCCESS_CODE = 200L;

    public static final String DEFAULT_SUCCESS_MESSAGE = "success";

    /**
     * 业务域或应用标识, 仅当产生错误时会赋值该字段
     */
    private String domain;

    /**
     * 结果码, 正确响应时该值为 Result#SUCCESS_CODE，错误响应时为错误代码
     */
    private long code;

    /**
     * 人工可读的消息, 正确响应时该值为 Result#DEFAULT_SUCCESS_MESSAGE，错误响应时为错误信息
     */
    private String msg;

    /**
     * 响应体, 正确响应时该值会被使用
     */
    private T data;

    /**
     * 当验证错误时，各项具体的错误信息
     */
    private List<Error> errors;

    public Result(T data) {
        this.setData(data);
        this.setCode(SUCCESS_CODE);
        this.setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    public Result(long code, String msg) {
        this.setCode(code);
        this.setMsg(msg);
    }

    public Result() {
        this.setCode(SUCCESS_CODE);
        this.setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     * 声明 Result
     *
     * @param data 数据体
     * @param <T>  数据体泛型
     * @return 数据结果结构
     */
    public static <T> Result<T> ofSuccess(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> ofError(int code, String msg) {
        return new Result<>(code, msg);
    }

    public static <T> Result<T> of(long code, String msg) {
        return new Result<>(code, msg);
    }

    @SuppressWarnings("rawtypes")
    public static boolean isSuccess(Result result) {
        return !Objects.isNull(result) && SUCCESS_CODE.equals(result.getCode());
    }

    @Deprecated
    public long getStatus() {
        return code;
    }

    public void addError(String name, String message) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(new Error(name, message));
    }

    /**
     * 统一 Response 返回值中错误信息的模型
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Error {

        /**
         * 错误的具体项
         */
        private String name;

        /**
         * 错误的具体项说明
         */
        private String message;
    }
}
