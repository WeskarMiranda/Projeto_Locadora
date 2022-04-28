package models;

public class Fornecedor {

    private String idFornecedor;
    private String cnpj;
	private String nome;
	private String telefone;
	private String cidade;
	private String estado;
    private String pais;

    
    public String getIdFornecedor() {
        return idFornecedor;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
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
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setIdFornecedor(String idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    @Override
	public String toString() {
		return "ID: "+getIdFornecedor()+ "| CNPJ "+getCnpj()+ "| Nome: "+ getNome()+ "| Telefone: "+ getTelefone()+ 
				"| Cidade: "+ getCidade()+ "| Estado: "+ getEstado() + "| Pais: "+ getPais();
	}

}