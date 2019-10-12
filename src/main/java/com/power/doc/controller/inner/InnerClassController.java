package com.power.doc.controller.inner;

import com.power.doc.entity.inner.InnerClassParent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
     *  InnerClassParent
     * @return InnerClassParent
     */
    @GetMapping("")
    public InnerClassParent get() {
        return new InnerClassParent();
    }


}
