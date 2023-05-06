package com.schen.demo_java17.Result;

import com.schen.demo_java17.enums.RhttpStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

// 统一结果返回类
@Data
@AllArgsConstructor
public class R {
    //标识返回的状态码
    private Integer code;
    //标识返回的信息
    private String message;
    //标识返回的数据
    private Object data;
    //私有化，防止new
    private R() {  }
  
    //成功
    public static R ok(Object data, String message) {
        return new R(200, message, data);  //code 也可以使用字典管理 下面会谈到
    }
    //成功返回 重载 message没有特别要求
    public static R ok(Object data) {
        return R.ok(data, "success"); //message 也可以使用字典管理 下面会谈到
    }
    // 失败
    public static R error( Integer code, String message) {
        return new R(code, message, "");
    }
    public static R error(RhttpStatusEnum rhttpStatusEnum){
        return new R(rhttpStatusEnum.getcode(),rhttpStatusEnum.getMessage(),"");
    }
}