package views;

import controllers.AvaliacaoController;
import models.Avaliacao;
import utils.Console;

public class CadastrarAvalicao {

    private static Avaliacao avaliacao;

	public static void renderizar() {
		
		System.out.println("\n **** AVALIACAO DE FILMES **** \n");
		    avaliacao = new Avaliacao();

           
      

			avaliacao.setFilme(Console.readString("Digite o nome do filme: "));



			avaliacao.setNota(Console.readInt("digite aqui sua nota de 1 a 5: "));
            if(avaliacao.getNota() >= 1 && avaliacao.getNota() <= 5){
                avaliacao.setPerguntaComentario(Console.readString("Deseja adicionar um comentario [S/N]?: "));
                if(avaliacao.getPerguntaComentario().equals("S") || avaliacao.getPerguntaComentario().equals("s") ){
                    avaliacao.setComentario(Console.readString("Digite seu comentario:\n"));

                }else{
                    avaliacao.setComentario("Sem comentarios");
                }

                AvaliacaoController.cadastrar(avaliacao);
                System.out.println("\nAvaliacao cadastrada com sucesso");
			} else {
				System.out.println("\nNota Invalida!");
			}
    
	}
}

