package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.AllService;

@Controller
public class BaseController {
    @Autowired(required = false)  AllService allService;

    public AllService getAllService() {
        return allService;
    }
}
