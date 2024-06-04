package dev.johanguse.transacaoestatistica.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {

    @GetMapping("/get")
    String home() {
        return "Hello World from get!";
    }

}
