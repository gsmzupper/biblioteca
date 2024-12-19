public class Livro {
    private String titulo;
    private String autor;
    private String codigoDoLivro;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, String codigoDoLivro, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoDoLivro = codigoDoLivro;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigoDoLivro() {
        return codigoDoLivro;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigoDoLivro(String codigoDoLivro) {
        this.codigoDoLivro = codigoDoLivro;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String exibirDetales() {
        String exibir = "Título: " + this.titulo + "\n"
                + "Autor: " + this.autor + "\n"
                + "Código do Livro: " + this.codigoDoLivro + "\n"
                + "Disponível: " + (this.disponibilidade ? "Sim" : "Não") + "\n";
        return exibir;
    }

    public void emprestar() {
        this.disponibilidade = false;
    }

    public void devolver() {
        this.disponibilidade = true;
    }
}
