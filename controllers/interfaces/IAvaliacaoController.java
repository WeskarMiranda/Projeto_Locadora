package controllers.interfaces;

import java.util.ArrayList;

import models.Avaliacao;

public interface IAvaliacaoController {
    
    void cadastrar(Avaliacao avaliacao);

    ArrayList<Avaliacao> listar();
}
