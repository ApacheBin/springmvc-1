package cn.edu.ecust.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

    /**
     * 1.使用 @RequestMapping 注解来映射请求的URL
     * 2.返回值会通过视图解析器解析为实际的物理视图，对于org.springframework.web.servlet.view.InternalResourceViewResolver
     * 视图解析器，会作如下的解析：
     * prefix+returnVal+后缀，得到实际的物理视图，然后做转发操作
     * @return
     */
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world!");
        return "success";
    }


}
