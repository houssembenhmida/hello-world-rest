/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author houssem
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World\n";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Good bye\n";
    }

    @GetMapping("/test")
    public String test() {
        return "3scale API management test\n";
    }
    
//    @GetMapping("/")
//    public String root() {
//        return "test application is running\n";
//    }

}
