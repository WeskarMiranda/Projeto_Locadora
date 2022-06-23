package controllers.interfaces;

import java.util.ArrayList;

import models.Funcionario;

public interface IFuncionarioController {
    
    ArrayList<Funcionario> Listar();

    boolean cadastrarFunc(Funcionario funcionario);

    Funcionario buscarCpf(String cpf);

    Funcionario buscarIdFuncionario(String idFuncionario);
}
