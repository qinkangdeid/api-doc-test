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
public class InnerClassParent {

    /**
     * innerClassParentName
     */
    private String innerClassParentName;

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


    }



}
