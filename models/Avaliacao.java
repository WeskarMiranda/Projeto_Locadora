package models;

public class Avaliacao {

    private String filme;
    private String cliente;
    private String perguntaComentario;
    private String comentario;
    private int nota;
    
    public String getPerguntaComentario() {
        return perguntaComentario;
    }
    public void setPerguntaComentario(String perguntaComentario) {
        this.perguntaComentario = perguntaComentario;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getFilme() {
        return filme;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return 
            " | Nome do filme: " +  filme + 
            " | Nota: " + nota +
            " | Comentario: " + comentario;
    }
    
}
