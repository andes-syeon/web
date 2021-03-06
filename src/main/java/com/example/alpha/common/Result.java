package com.example.alpha.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Result<T> {

    private final T resultObject;
    private final ResultCode resultCode;

    public Result(T resultObject, ResultCode resultCode) {
        this.resultObject = resultObject;
        this.resultCode = resultCode;
    }

    @JsonIgnore
    public T getResultObject() {
        return resultObject;
    }

    public int getRtnCd() {
        return resultCode.getRtnCd();
    }

    public String getRtnMsg() {
        return resultCode.getRtnMsg();
    }

    public T getRtnObj() {
        return resultObject;
    }

    @JsonIgnore
    public ResultCode getResultCode() {
        return resultCode;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return ResultCode.Success.equals(resultCode);
    }

    @JsonIgnore
    public boolean isNotSuccess() {
        return !isSuccess();
    }

    @Override
    public String toString() {
        return "{" +
                "resultObject=" + resultObject +
                ", resultCode=" + resultCode +
                '}';
    }
}