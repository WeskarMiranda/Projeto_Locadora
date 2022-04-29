package models;

public class Dvd {

    private String idDvd;
	private String nome;
    private String ano;
	private String categoria;
	private Double preco;
	private String duracao;
    private int estoque;

    public String   getIdDvd() {
        return idDvd;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdDvd(String idDvd) {
        this.idDvd = idDvd;
    }

    @Override
	public String toString() {
		return "ID: "+getIdDvd()+ "| Nome: "+ getNome()+ "| Ano de lancamento: "+ getAno()+ "| Categoria "+getCategoria()+ 
				"| Preco: "+ getPreco()+ "| Duracao: "+ getDuracao() + "| Estoque: "+ getEstoque();
	}

}
