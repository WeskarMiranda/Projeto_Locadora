package controllers;

import java.util.ArrayList;

import controllers.interfaces.ISugestaoController;
import models.Sugestao;

public class SugestaoController implements ISugestaoController {

    private static ArrayList<Sugestao> sugestaoLista = new ArrayList<Sugestao>();
     
    @Override
    public void cadastrar(Sugestao sugestao){
        sugestaoLista.add(sugestao);
    }

    @Override
    public ArrayList<Sugestao> listar() {
        return sugestaoLista;
            
    }
    
    @Override
    public boolean CadastrarSugestao(Sugestao sugestao){
        for(Sugestao sugestaoCad : sugestaoLista) {
            if(sugestaoCad.getFilme().equals(sugestao.getFilme()))  {
            return true;
        }
    }
        return false;
    }

    @Override
    public Sugestao buscarNome(String Filme) {
	for(Sugestao sugestaoCad : sugestaoLista) {
		if(sugestaoCad.getFilme().equals(Filme)) {
            return sugestaoCad;
		}
	}
	return null;
	}
}
