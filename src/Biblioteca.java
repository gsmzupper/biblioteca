import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        Livro livroEmprestar = null;
        Usuario usuarioEmprestimo = null;

        for (Livro livro : livros) {
            if (livro.getCodigoDoLivro().equalsIgnoreCase(isbn) && livro.isDisponibilidade()) {
                livroEmprestar = livro;
                break;
            }
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario) {
                usuarioEmprestimo = usuario;
                break;
            }
        }

        if (livroEmprestar != null && usuarioEmprestimo != null) {
            livroEmprestar.setDisponibilidade(false);
            usuarioEmprestimo.adicionarLivroEmprestado(livroEmprestar);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Livro ou usuário não encontrado, ou livro indisponível.");
        }
    }

    public void realizarDevolucao(String isbn, int idUsuario) {
        Livro livroDevolver = null;
        Usuario usuarioDevolucao = null;

        // Busca o livro pelo ISBN na lista de livros emprestados do usuário
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario) {
                usuarioDevolucao = usuario;
                for (Livro livro : usuario.getLivrosEmprestados()) {
                    if (livro.getIsbn().equals(isbn)) {
                        livroDevolver = livro;
                        break;
                    }
                }
                break;
            }
        }

        // Verifica se o livro e o usuário foram encontrados
        if (livroDevolver != null && usuarioDevolucao != null) {
            livroDevolver.setDisponivel(true); // Usa o método setDisponivel() da classe Livro
            usuarioDevolucao.removerLivroEmprestado(livroDevolver);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Livro ou usuário não encontrado.");
        }
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro); // Usa o método toString() da classe Livro
            }
        }
    }
}
