package io.github.hexa.starter.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@RestController
@RequestMapping("/test")
public class Test {

    /**
     * 构造函数
     */
    public Test() {}
    /**
     * 测试接口
     * @return test
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
