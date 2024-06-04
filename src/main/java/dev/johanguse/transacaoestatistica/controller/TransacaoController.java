package dev.johanguse.transacaoestatistica.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @PostMapping("/post")
    String home() {
        return "Hello World from post!";
    }

}
