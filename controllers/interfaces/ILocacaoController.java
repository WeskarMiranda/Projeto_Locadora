package controllers.interfaces;

import java.util.ArrayList;

import models.Locacao;

public interface ILocacaoController {
    
    void cadastrar(Locacao locacao);

    ArrayList<Locacao> listar();   
}
