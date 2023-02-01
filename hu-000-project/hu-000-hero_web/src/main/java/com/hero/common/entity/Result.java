package com.hero.common.entity;

import com.mysql.cj.protocol.ProtocolEntity;
import com.mysql.cj.protocol.ResultBuilder;

//public class Result<T> {
//    private boolean flag;
//
//    private Integer code;
//
//    private String message;
//
//    private T data;
//
//    public static <T> ResultBuilder<T> builder() {
//        return new ResultBuilder() {
//            @Override
//            public boolean addProtocolEntity(ProtocolEntity protocolEntity) {
//                return false;
//            }
//
//            @Override
//            public Object build() {
//                return null;
//            }
//        };
//    }
//
//    public Result(boolean flag, Integer code, String message, Object data) {
//        this.flag = flag;
//        this.code = code;
//        this.message = message;
//        this.data = (T)data;
//    }
//
//    public Result(boolean flag, Integer code, String message) {
//        this.flag = flag;
//        this.code = code;
//        this.message = message;
//    }
//
//    public Result() {
//        this.flag = true;
//        this.code = Integer.valueOf(20000);
//        this.message = "";
//    }
//
//    public boolean isFlag() {
//        return this.flag;
//    }
//
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }
//
//    public Integer getCode() {
//        return this.code;
//    }
//
//    public void setCode(Integer code) {
//        this.code = code;
//    }
//
//    public String getMessage() {
//        return this.message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public T getData() {
//        return this.data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
//}

public class Result<T> {
    private boolean flag;
    private Integer code;
    private String message;
    private T data;

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.flag = true;
        this.code = 20000;
        this.message = "执行成功";
    }

    public boolean isFlag() {
        return this.flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResultBuilder<T> builder() {
        return new ResultBuilder();
    }

    public static class ResultBuilder<T> {
        private boolean flag;
        private Integer code;
        private String message;
        private T data;

        ResultBuilder() {
        }

        public ResultBuilder<T> flag(final boolean flag) {
            this.flag = flag;
            return this;
        }

        public ResultBuilder<T> code(final Integer code) {
            this.code = code;
            return this;
        }

        public ResultBuilder<T> message(final String message) {
            this.message = message;
            return this;
        }

        public ResultBuilder<T> data(final T data) {
            this.data = data;
            return this;
        }

        public Result<T> build() {
            return new Result(this.flag, this.code, this.message, this.data);
        }

        public String toString() {
            return "Result.ResultBuilder(flag=" + this.flag + ", code=" + this.code + ", message=" + this.message + ", data=" + this.data + ")";
        }
    }
}
