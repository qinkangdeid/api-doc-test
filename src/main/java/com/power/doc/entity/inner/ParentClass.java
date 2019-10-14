package com.power.doc.entity.inner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qinkangdeid
 * @since 2019/10/12 17:38
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParentClass {

    /**
     * 外部类地址名称
     */
    private String parentClassName;


    /**
     * 外部类地址
     */
    private String parentClassAddress;

    /**
     * innerClass
     */
    private InnerClass innerClass;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class InnerClass {

        /**
         * 内部类名称
         */
        private String innerName;

        /**
         * 内部类age
         */
        private Integer age;


    }


}
