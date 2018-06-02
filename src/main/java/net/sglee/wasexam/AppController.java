package net.sglee.wasexam;

/**
 * written by Hyuntak
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "This is root";
    }
    
    @RequestMapping(value = "/A", method = RequestMethod.GET)
    @ResponseBody
    public String apiA() {
    		return "This is api A";
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String user(@RequestParam("name") String name) {
    		return "Hello " + name;
    }

}
