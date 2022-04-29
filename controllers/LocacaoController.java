package controllers;

import java.util.ArrayList;

import models.Locacao;

public class LocacaoController {
    
    private static ArrayList<Locacao> locacaoLista = new ArrayList<Locacao>();

    public void cadastrar(Locacao locacao) {
        locacaoLista.add(locacao);
    }

    public static ArrayList<Locacao> listar() {
        return locacaoLista;
    }
    
    


}
