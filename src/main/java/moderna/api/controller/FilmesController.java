package moderna.api.controller;

import moderna.api.entidades.Filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController {

@GetMapping("/lista-filmes")
    public List<Filmes> listarFilmesPreferidos(){
        List<Filmes> listaDeFilmesPreferidos = new ArrayList<>();
        Filmes filme1 = new Filmes();
        Filmes filme2 = new Filmes();
        Filmes filme3 = new Filmes();
        filme1.setNome("A espera de um milagre");
        filme1.setCategoria("Drama");
        filme1.setId(1);
        filme2.setNome("A lagoa azul");
        filme2.setCategoria("Romance");
        filme2.setId(2);
        filme3.setNome("De volta para o futuro");
        filme3.setCategoria("Comedia");
        filme3.setId(3);

        listaDeFilmesPreferidos.add(filme1);
        listaDeFilmesPreferidos.add(filme2);
        listaDeFilmesPreferidos.add(filme3);


        return listaDeFilmesPreferidos;
    }

}
