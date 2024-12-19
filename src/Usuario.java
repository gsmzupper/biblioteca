import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosImprestados = new ArrayList<>();

    public Usuario(String nome, int id, ArrayList<Livro> livrosImprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosImprestados = livrosImprestados;
    }
}
