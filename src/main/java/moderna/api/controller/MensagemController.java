package moderna.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("mensagem")
@RestController
public class MensagemController {

    @GetMapping("bemvindo")
    public String retornaMensagem(){
        return "Seja bem vindo a API Rest";



    }
    @GetMapping("assustados")
    public String retornaMensagem2(){
        return "Seja bem vindo a API Rest 2";



    }

}
