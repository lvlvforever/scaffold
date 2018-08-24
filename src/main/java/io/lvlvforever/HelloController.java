/**
 * Description:
 * User: daipeng
 * Date: 2018-08-23 15:49
 * Project:scaffold
 */
package io.lvlvforever;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {


    @RequestMapping("hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("name", "lvlvforever");
        return "hello";
    }

    @RequestMapping("users")
    public String users(Model model) {
        User user1 = new User("li", "male");
        User user2 = new User("lei", "female");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        model.addAttribute("list", list);
        return "user";
    }

}
