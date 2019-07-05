package nikola.tesla.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {

    @RequestMapping(method = RequestMethod.GET, path = {"", "/", "index", "index.html"})
    public String index(){

        return "index";

    }
}

