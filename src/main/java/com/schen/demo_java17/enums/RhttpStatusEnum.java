package com.schen.demo_java17.enums;

public enum RhttpStatusEnum {
    //举个栗子 查询失败与登录失败
    QUERY_user_FAIL(201, "查询失败"),
    LOGIN_user_FAIL(202, "登录失败");
  
    final int code;
    final String message;
    RhttpStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
 //生成get方法  已经赋值了所以不需要set方法
    public int getcode(){
        return code;
    }
    public String getMessage() {
        return message;
    }
}