package views;




import controllers.ClienteController;
import controllers.DvdController;
import controllers.LocacaoController;
import models.Locacao;
import models.Cliente;
import models.Dvd;
import utils.Console;

public class CadastrarLocacao {
    public static void renderizar()  {
        Locacao locacao = new Locacao();
        LocacaoController locacaoController = new LocacaoController();
    
        //ID
        int Idlocacao = Console.readInt("Digite a id da locacao: ");
            locacao.setIdlocacao(Idlocacao);      

         // Cliente
         String cpfCliente = Console.readString("Digite o CPF do cliente: ");
         Cliente cliente = ClienteController.buscarCpf(cpfCliente);
         if (cliente != null) {
             locacao.setCliente(cliente);
 
             // DVD
             String idDvd = Console.readString("Digite o ID do DVD: ");
             Dvd dvd = DvdController.buscarId(idDvd);
             if (dvd != null) {

                 if(dvd.getEstoque() !=  0){
                 locacao.setDvd(dvd);
               
                // Data de Locacao
                 String Data_locacao= Console.readString("Digite a data De locacao: "); 
                    locacao.setData_locacao(Data_locacao);       
                    // Data de Devolucao prevista
                    String Data_entrega = Console.readString("Digite a data De Devolucao: "); 
                    locacao.setDataconvertida1(Data_entrega);
                locacaoController.cadastrar(locacao);
                 }else{
                     System.out.println("Fora de estoque!");
                    }
             } else {
                 System.out.println("DVD não encontrado!");
             }
         } else {
             System.out.println("Cliente não encontrado!");
         }
}
}
