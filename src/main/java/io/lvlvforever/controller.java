/**
 * Description:
 * User: daipeng
 * Date: 2018-08-23 15:49
 * Project:scaffold
 */
package io.lvlvforever;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class controller {

    @RequestMapping("hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("name", "lvlvforever");
        return "hello";
    }
}
