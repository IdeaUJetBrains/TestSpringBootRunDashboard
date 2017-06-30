package springboot_test2.demo2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/{name}/{env}")
    public String foo(@PathVariable String name, @PathVariable String env) {
        return "hello name = " + name + "env = " + env;
    }

    @RequestMapping("/test")
    public String foo1() {
        return "hello2";
    }
}
