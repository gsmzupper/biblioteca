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
