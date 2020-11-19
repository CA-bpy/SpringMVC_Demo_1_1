package com.ca_bpy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Create controller object.
 */
@Controller("myController")
public class MyController {
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/index.jsp");
        return mv;
    }
}
