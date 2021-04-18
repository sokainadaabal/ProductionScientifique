package com.ProductionScientifique;
import com.model.Professor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class HelloWorlController {
    @RequestMapping("/")
    public String hello()
    {
        return "home page";
    }
}
