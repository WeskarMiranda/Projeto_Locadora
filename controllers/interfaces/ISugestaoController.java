package controllers.interfaces;

import java.util.ArrayList;

import models.Sugestao;

public interface ISugestaoController {
    
    void cadastrar(Sugestao sugestao);

    ArrayList<Sugestao> listar();

    boolean CadastrarSugestao(Sugestao sugestao);

    Sugestao buscarNome(String Filme);
}
