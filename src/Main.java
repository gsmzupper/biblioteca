import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        int opicao;
        do {
            exibirMenu();
            try {
                opicao = sc.nextInt();
                sc.nextLine();

processarEscolha(opicao);
            } catch (InputMismatchException e) {
                System.out.println("\tEntrada inválida. Digite um número.");
                sc.nextLine();
                opicao = -1;
            }
        } while (opicao != 6);

        GeradorDeArquivoTXT gerador = new GeradorDeArquivoTXT(biblioteca);
        gerador.gravarArquivo("Registro.txt");
        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- Sistema de Gerenciamento de Biblioteca ---");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Realizar empréstimo");
        System.out.println("4. Realizar devolução");
        System.out.println("5. Exibir livros disponíveis");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void processarEscolha(int escolha) {
        switch (escolha) {
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarUsuario();
                break;
            case 3:
                realizarEmprestimo();
                break;
            case 4:
                realizarDevolucao();
                break;
            case 5:
                biblioteca.exibirLivrosDisponiveis();
                break;
            case 6:
                System.out.println("Volte sempre que quiser!");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    private static void cadastrarLivro() {
        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();
        System.out.print("Digite o autor: ");
        String autor = sc.nextLine();
        System.out.print("Digite o ISBN do livro: ");
        String isbn = sc.nextLine();
        Livro livro = new Livro(titulo, autor, isbn, true);
        biblioteca.cadastrarLivro(livro);
    }

    private static void cadastrarUsuario() {
        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o ID do usuário: ");
        int id = sc.nextInt();
        sc.nextLine();

        Usuario usuario = new Usuario(nome, id);
        biblioteca.cadastrarUsuario(usuario);
    }

    private static void realizarEmprestimo() {
        System.out.print("Digite o ISBN do livro: ");
        String isbn = sc.nextLine();
        System.out.print("Digite o ID do usuário: ");
        int id = sc.nextInt();
sc.nextLine();

biblioteca.realizarEmprestimo(isbn, id);
    }

    private static void realizarDevolucao() {
        System.out.print("Digite o ISBN do livro: ");
        String isbn = sc.nextLine();
        System.out.print("Digite o ID do usuário: ");
        int id = sc.nextInt();
sc.nextLine();

biblioteca.realizarDevolucao(isbn, id);
    }



}