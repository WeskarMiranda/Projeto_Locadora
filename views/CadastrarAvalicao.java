package views;

import controllers.AvaliacaoController;
import models.Avaliacao;
import utils.Console;
import views.interfaces.IViews;

public class CadastrarAvalicao implements IViews {

    @Override
	public  void renderizar() {
		
		System.out.println("\n **** AVALIACAO DE FILMES **** \n");
		   Avaliacao avaliacao = new Avaliacao();
		   AvaliacaoController avaliacaoController = new AvaliacaoController();

           
      

			avaliacao.setFilme(Console.readString("Digite o nome do filme: "));



			avaliacao.setNota(Console.readInt("digite aqui sua nota de 1 a 5: "));
            if(avaliacao.getNota() >= 1 && avaliacao.getNota() <= 5){
                avaliacao.setPerguntaComentario(Console.readString("Deseja adicionar um comentario [S/N]?: "));
                if(avaliacao.getPerguntaComentario().equals("S") || avaliacao.getPerguntaComentario().equals("s") ){
                    avaliacao.setComentario(Console.readString("Digite seu comentario:\n"));

                }else{
                    avaliacao.setComentario("Sem comentarios");
                }

                avaliacaoController.cadastrar(avaliacao);
                System.out.println("\nAvaliacao cadastrada com sucesso");
			} else {
				System.out.println("\nNota Invalida!");
			}
    
	}

	@Override
	public void printClient() {}
}

