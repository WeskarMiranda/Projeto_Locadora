package models;

public class Funcionario extends Pessoa{

	private String idFuncionario;
   
    private String cargo;

    
    public String getIdFuncionario() {
        return idFuncionario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
	public String toString() {
		return "ID: "+getIdFuncionario()+ "|CPF: "+getCpf()+ "| Nome: "+ getNome()+ "| Cargo: "+getCargo() + "| Data de cadastro: "+ getDataCad()+ 
				"| Cidade: "+ getCidade()+ "| Estado: "+ getEstado();
	}

}
