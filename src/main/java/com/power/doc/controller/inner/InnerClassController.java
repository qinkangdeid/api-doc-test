package com.power.doc.controller.inner;

import com.power.doc.entity.AgeEnum;
import com.power.doc.entity.inner.ParentClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinkangdeid
 * @since 2019/10/12 17:37
 * Description:
 */
@RestController
@RequestMapping("/inner/calss")
public class InnerClassController {

    /**
     * InnerClassParent
     * @param age 年龄
     * @return InnerClassParent
     */
    @GetMapping("")
    public ParentClass get(@RequestParam AgeEnum age) {
        return new ParentClass();
    }


}
