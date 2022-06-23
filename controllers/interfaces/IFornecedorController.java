package controllers.interfaces;

import java.util.ArrayList;

import models.Fornecedor;

public interface IFornecedorController {
    
    ArrayList<Fornecedor> Listar();

    boolean cadastrarForn(Fornecedor fornecedor);
    
    Fornecedor buscarCnpj(String cnpj);

    Fornecedor buscarId(String idFornecedor);
}
