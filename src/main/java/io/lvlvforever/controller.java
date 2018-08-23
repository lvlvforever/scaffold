/**
 * Description:
 * User: daipeng
 * Date: 2018-08-23 15:49
 * Project:scaffold
 */
package io.lvlvforever;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
