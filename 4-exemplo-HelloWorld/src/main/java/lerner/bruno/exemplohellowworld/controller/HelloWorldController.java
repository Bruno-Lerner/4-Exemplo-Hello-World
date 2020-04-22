package lerner.bruno.exemplohellowworld.controller;

import lerner.bruno.exemplohellowworld.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 10:20
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Agora sim, vamo dale!";
    }
}
