package models;

public class Funcionario {

	private String idFuncionario;
    private String cpf;
	private String nome;
    private String cargo;
	private String dataCad;
	private String cidade;
	private String estado;

    
    public String getIdFuncionario() {
        return idFuncionario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getDataCad() {
        return dataCad;
    }
    public void setDataCad(String dataCad) {
        this.dataCad = dataCad;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
