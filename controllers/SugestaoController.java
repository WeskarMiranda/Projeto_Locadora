package controllers;

import java.util.ArrayList;

import models.Sugestao;

public class SugestaoController {

    private static ArrayList<Sugestao> sugestaoLista = new ArrayList<Sugestao>();
     
    public static void cadastrar(Sugestao sugestao){
        sugestaoLista.add(sugestao);
    }
        public  ArrayList<Sugestao> listar() {
            return sugestaoLista;
            
        }
    
        public static boolean CadastrarSugestao(Sugestao sugestao){
            for(Sugestao sugestaoCad : sugestaoLista) {
                if(sugestaoCad.getFilme().equals(sugestao.getFilme()))  {
                return true;
            }
        }
            return false;
        }

        public static Sugestao buscarNome(String Filme) {
		for(Sugestao sugestaoCad : sugestaoLista) {
			if(sugestaoCad.getFilme().equals(Filme)) {
                return sugestaoCad;
			}
		}
		return null;
	}
}
