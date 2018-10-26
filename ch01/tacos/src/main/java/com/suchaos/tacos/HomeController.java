package com.suchaos.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * A controller class that
 * handles requests for the homepage
 *
 * @author suchao
 * @date 2018/10/25
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
