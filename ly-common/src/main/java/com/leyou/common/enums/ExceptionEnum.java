package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {
    OK(200,"返回成功"),
    PRICE_CANNOT_BE_NULL(400,"价格不能为空")
    ;
    private int Code;
    private String msg;

}
