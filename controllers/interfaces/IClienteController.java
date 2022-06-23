package controllers.interfaces;

import java.util.ArrayList;

import models.Cliente;

public interface IClienteController {

    ArrayList<Cliente> listar();

    boolean cadastrarCli(Cliente cliente);

    void atualizar(Cliente cliente);

    Cliente buscarCpf(String cpf);

    Cliente buscarId(String idCliente);

    void excluirCliente(Cliente c);

    boolean exists(Cliente c);
}
