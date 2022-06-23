package controllers;

import java.util.ArrayList;

import controllers.interfaces.IClienteController;
import models.Cliente;

public class ClienteController implements IClienteController {
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@Override
	public ArrayList<Cliente> listar(){
		return clientes;
	}

	@Override
	public boolean cadastrarCli(Cliente cliente){
		if( (buscarCpf(cliente.getCpf()) == null) && buscarId(cliente.getIdCliente()) == null)  {
			clientes.add(cliente);
			return true;
		}
		return false;
	}
	
	@Override
	public void atualizar(Cliente cliente) {
		int index = clientes.indexOf(cliente);
		if(index > 0) clientes.add(index, cliente);
	}

	@Override
	public Cliente buscarCpf(String cpf) {
		for(Cliente cliCad : clientes) {
			if(cliCad.getCpf().equals(cpf)) {
				return cliCad;
			}
		}
		return null;
	}

	@Override
    public Cliente buscarId(String idCliente) {
		for(Cliente cliCad : clientes) {
			if(cliCad.getIdCliente().equals(idCliente)) {
				return cliCad;
			}
		}
		return null;
	}

	@Override
	public void excluirCliente(Cliente c) {
		clientes.remove(c);
	}

	@Override
	public boolean exists(Cliente c){
		return clientes.contains(c);
	}
}
