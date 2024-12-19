import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosImprestados = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Livro> getLivrosImprestados() {
        return livrosImprestados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLivrosImprestados(ArrayList<Livro> livrosImprestados) {
        this.livrosImprestados = livrosImprestados;
    };

public String exibirDetalis() {
        String exibir = "Nome: " + nome + "\n"
                + "ID: " + id + "\n"
                + "Livros Emprestados:\n";
        if (livrosImprestados.isEmpty()) {
            exibir += "  Nenhum livro emprestado.\n";
        } else {
            for (Livro livro : livrosImprestados) {
                exibir += "  - " + livro.getTitulo() + "\n";
            }
        }
        return exibir;
}

public void adicionarLivro(Livro livro) {
    this.livrosImprestados.add(livro);
}

public void removeLivro(Livro livro) {
    this.livrosImprestados.remove(livro);
}
}
