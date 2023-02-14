package Dadaicksun2.Dadaicksun12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {

    @GetMapping("/")
    public String HElloWorld() {
        return "To-do Application !";
    }
}
