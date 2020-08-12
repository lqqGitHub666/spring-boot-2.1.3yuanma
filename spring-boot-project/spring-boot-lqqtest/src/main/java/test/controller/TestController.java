package test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者 lqq
 * @ClassName 类名 TestController
 * @date 2020/8/12 16:56
 * @注释：
 */
@RestController
public class TestController {

	@GetMapping("/test")
	public String test(){
		return "hello world";
	}
}
