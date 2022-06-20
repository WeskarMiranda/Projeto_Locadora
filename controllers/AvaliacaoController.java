package controllers;

import java.util.ArrayList;

import models.Avaliacao;

public class AvaliacaoController {

    private static ArrayList<Avaliacao> avaliacaoLista = new ArrayList<Avaliacao>();
     
    public static void cadastrar(Avaliacao avaliacao){
        avaliacaoLista.add(avaliacao);
    }
        public  ArrayList<Avaliacao> listar() {
            return avaliacaoLista;
            
        }
    
}
