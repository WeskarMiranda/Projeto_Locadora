package controllers;

import java.util.ArrayList;

import controllers.interfaces.ILocacaoController;
import models.Locacao;

public class LocacaoController implements ILocacaoController {
    
    private static ArrayList<Locacao> locacaoLista = new ArrayList<Locacao>();

    @Override
    public void cadastrar(Locacao locacao) {
        locacaoLista.add(locacao);
    }

    @Override
    public ArrayList<Locacao> listar() {
        return locacaoLista;
    }

}
