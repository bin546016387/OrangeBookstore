package com.orange.base.result;

public class Result<T> {

    private final static String SUCCESS = "success";

    private final static String FAILURE = "failure";

    private int code;

    private String msg;

    private T data;

    public static Result<Void> success(){
        return success(null);
    }

//    public static <T> Result<T> success() {
//        return new Result<T>().setCode(ResultEnum.SUCCESS).setMsg(SUCCESS);
//    }

    public static <T> Result<T> success(T data) {
        return new Result<T>().setCode(ResultEnum.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> Result<T> successMsg(String msg) {
        return new Result<T>().setCode(ResultEnum.SUCCESS).setMsg(msg);
    }

    public static <T> Result<T> failure() {
        return new Result<T>().setCode(ResultEnum.FAILURE).setMsg(FAILURE);
    }

    public static <T> Result<T> failure(int code, String msg) {
        return new Result<T>().setCode(code).setMsg(msg);
    }

    public static <T> Result<T> failure(int code, String msg, T data) {
        return new Result<T>().setCode(code).setMsg(msg).setData(data);
    }

    public static <T> Result<T> failureMsg(String msg) {
        return new Result<T>().setCode(ResultEnum.FAILURE).setMsg(msg);
    }

    public Result<T> setCode(ResultEnum resultEnum) {
        this.code = resultEnum.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public Result<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }


//    public static class ResultDto<T> {
//        private int code;
//
//        private String msg;
//
//        private T data;
//
//        public ResultDto<T> setCode(ResultEnum resultEnum) {
//            this.code = resultEnum.code;
//            return this;
//        }
//
//        public int getCode() {
//            return code;
//        }
//
//        public ResultDto<T> setCode(int code) {
//            this.code = code;
//            return this;
//        }
//
//        public String getMsg() {
//            return msg;
//        }
//
//        public ResultDto<T> setMsg(String msg) {
//            this.msg = msg;
//            return this;
//        }
//
//        public T getData() {
//            return data;
//        }
//
//        public ResultDto<T> setData(T data) {
//            this.data = data;
//            return this;
//        }
//
//    }
}
