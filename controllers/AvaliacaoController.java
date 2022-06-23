package controllers;

import java.util.ArrayList;

import controllers.interfaces.IAvaliacaoController;
import models.Avaliacao;

public class AvaliacaoController implements IAvaliacaoController {

    private static ArrayList<Avaliacao> avaliacaoLista = new ArrayList<Avaliacao>();
     
    @Override
    public void cadastrar(Avaliacao avaliacao){
        avaliacaoLista.add(avaliacao);
    }

    @Override
    public  ArrayList<Avaliacao> listar() {
            return avaliacaoLista;
            
    }
    
}
