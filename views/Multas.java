package views;

import java.util.Date;
import controllers.LocacaoController;
import models.Locacao;

public class Multas {
	
	

    public static  void renderizar() { 
		// Cria a variavel de data com a data atual 
		Date dataatual = new Date();
		;
		
		for (Locacao locacaoCadastrada : LocacaoController.listar()){
			//Faz a verificacao se a data prevista para entrega é  menor que a data atual
        if(locacaoCadastrada.Dataconvertida1.before(dataatual) ){
		System.out.println("\n **** LISTAGEM DE CLIENTES COM MULTA **** \n");
		
			System.out.println(locacaoCadastrada);
		}
	}
  
    
}
}

