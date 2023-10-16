package moderna.api.controller;

import moderna.api.entidades.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @GetMapping("exibir-pessoa")
    public Pessoa exibePessoa(){
        Pessoa p1 = new Pessoa();
        p1.setId(1);
        p1.setDocumento("321321");
        p1.setNome("John doe");

        return p1;
    }

    @GetMapping("/buscar/{id}")
    public Pessoa exibePessoaPeloID(@PathVariable int id){


        Pessoa p1 = new Pessoa();
        p1.setId(1);
        p1.setDocumento("321321");
        p1.setNome("John doe");

        Pessoa p2 = new Pessoa();
        p2.setId(2);
        p2.setDocumento("222444");
        p2.setNome("Maria doe");

        if(id == 1){
            return p1;

        }
        return p2;

    }

    @GetMapping("somar/{n1}/{n2}")
    public int somaDoisNumeros(@PathVariable int n1, @PathVariable int n2){
        return n1+n2;
    }


}