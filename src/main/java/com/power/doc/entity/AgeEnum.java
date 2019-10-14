package com.power.doc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author qinkangdeid
 * @since 2019/10/14 18:43
 * Description: 性别男
 */
@Getter
@AllArgsConstructor
public enum AgeEnum {

    /**
     * 性别男
     */
    MALE(0,"男"),
    /**
     * 性别女
     */
    WOMAN(1,"女");


    private Integer code;
    private String  desc;


}
