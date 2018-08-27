/**
 * Description:
 * User: daipeng
 * Date: 2018-08-24 11:47
 * Project:scaffold
 */
package io.lvlvforever;

import io.lvlvforever.tinydemo.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HelloControllerTest {
    private MockMvc mockMvc;
    private InternalResourceViewResolver resolver;


    @Before
    public void setUp() {
        resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp");
        resolver.setSuffix(".jsp");
    }

    @Test
    public void testHello() {
        HelloController controller = new HelloController();
//        需要重新设定viewResolver否则会进入转发循环
        mockMvc = standaloneSetup(controller).setViewResolvers(resolver).build();
        try {
            mockMvc.perform(get("/hello")).andExpect(view().name("hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
