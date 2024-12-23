import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeradorDeArquivoTXT {
    private Biblioteca biblioteca;

    public GeradorDeArquivoTXT(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void gravarArquivo(String nomeDOArquivo) {
        try (FileWriter fw = new FileWriter(nomeDOArquivo);
             PrintWriter gravador = new PrintWriter(fw)) {
            gravador.println("Livros Cadastrados:");
            for (Livro livro : biblioteca.getLivros()) {
                gravador.println(livro.exibirDetalhes());
            }

            gravador.println("\nUsuários Cadastrados:");
            for (Usuario usuario : biblioteca.getUsuarios()) {
                gravador.println(usuario.exibirDetalhes());
            }

            gravador.println("\nLivros Emprestados:");
            for (Usuario usuario : biblioteca.getUsuarios()) {
                ArrayList<Livro> livrosEmprestados = usuario.getLivrosImprestados();

                if (!livrosEmprestados.isEmpty()) {
                    gravador.println("Usuário: " + usuario.getNome() + " (ID: " + usuario.getId() + ")");
                }
                for (Livro livro : livrosEmprestados) {
                    gravador.println("  - " + livro.getTitulo() + " (ISBN: " + livro.getCodigoDoLivro() + ")");
                }
            }

            gravador.println("\nLivros Disponíveis:");
            for (Livro livro : biblioteca.getLivros()) {
                if (livro.isDisponibilidade()) {
                    gravador.println(livro.exibirDetalhes());
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao gravar dados no arquivo: " + e.getMessage());
        }
    }
}