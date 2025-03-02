Sistema de Gerenciamento de Biblioteca
Este projeto é um sistema simples de gerenciamento de biblioteca, desenvolvido em Java, que permite cadastrar livros e usuários, realizar empréstimos e devoluções, exibir livros disponíveis e gerar um relatório em arquivo .txt com os dados da biblioteca.
Funcionalidades Principais
1. Cadastro de Livros: Permite adicionar novos livros à biblioteca.
2. Cadastro de Usuários: Permite registrar novos usuários no sistema.
3. Empréstimo de Livros: Realiza o empréstimo de um livro disponível para um usuário.
4. Devolução de Livros: Permite que um usuário devolva um livro emprestado.
5. Exibição de Livros Disponíveis: Lista todos os livros que estão disponíveis para empréstimo.
6. Geração de Relatório: Cria um arquivo .txt com informações sobre os livros cadastrados, usuários registrados, livros emprestados e livros disponíveis.
 
Estrutura do Projeto
1. Classe Biblioteca
Descrição: Gerencia os livros e usuários cadastrados, além de controlar os empréstimos e devoluções.
Principais Métodos:
cadastrarLivro(Livro livro): Adiciona um novo livro à biblioteca.
cadastrarUsuario(Usuario usuario): Registra um novo usuário.
realizarEmprestimo(String isbn, int idUsuario): Realiza o empréstimo de um livro para um usuário.
realizarDevolucao(String isbn, int idUsuario): Permite a devolução de um livro emprestado.
exibirLivrosDisponiveis(): Exibe todos os livros disponíveis para empréstimo.
 
2. Classe Livro
Descrição: Representa um livro na biblioteca.
Atributos:
titulo: Título do livro.
autor: Autor do livro.
codigoDoLivro: Código único (ISBN) do livro.
disponibilidade: Indica se o livro está disponível para empréstimo.
Principais Métodos:
exibirDetalhes(): Retorna uma string com os detalhes do livro.
emprestar(): Marca o livro como indisponível.
devolver(): Marca o livro como disponível.
 
3. Classe Usuario
Descrição: Representa um usuário da biblioteca.
Atributos:
nome: Nome do usuário.
id: Identificador único do usuário.
livrosImprestados: Lista de livros emprestados pelo usuário.
Principais Métodos:
adicionarLivro(Livro livro): Adiciona um livro à lista de livros emprestados pelo usuário.
removeLivro(Livro livro): Remove um livro da lista de livros emprestados.
exibirDetalhes(): Retorna uma string com os detalhes do usuário e os livros emprestados.
 
4. Classe GeradorDeArquivoTXT
Descrição: Responsável por gerar um relatório em formato .txt com os dados da biblioteca.
Principais Métodos:
gravarArquivo(String nomeDoArquivo): Gera um arquivo contendo:
Livros cadastrados.
Usuários cadastrados.
Livros emprestados e seus respectivos usuários.
Livros disponíveis.
 
5. Classe Main
Descrição: Classe principal que contém o menu interativo para o usuário.
Funcionalidades:
Exibe um menu com as opções disponíveis.
Permite ao usuário interagir com o sistema, escolhendo as opções de cadastro, empréstimo, devolução, exibição de livros disponíveis e saída do programa.
Gera automaticamente o relatório em .txt ao encerrar o programa.
 
Como Usar
1. Executar o Programa: Compile e execute a classe Main.
2. Interagir com o Menu:
Escolha as opções exibidas no menu para cadastrar livros e usuários, realizar empréstimos e devoluções, ou exibir livros disponíveis.
3. Relatório Final: Ao sair do programa, um arquivo chamado Registro.txt será gerado com todas as informações da biblioteca.
 
Exemplo de Uso
1. Cadastrar um Livro:
Digite o título, autor e ISBN do livro.
2. Cadastrar um Usuário:
Insira o nome e o ID do usuário.
3. Realizar um Empréstimo:
Informe o ISBN do livro e o ID do usuário.
4. Realizar uma Devolução:
Informe o ISBN do livro e o ID do usuário.
5. Exibir Livros Disponíveis:
Veja a lista de livros que podem ser emprestados.
 
Relatório Gerado
O arquivo Registro.txt contém:
Lista de todos os livros cadastrados.
Lista de todos os usuários registrados.
Livros emprestados e os respectivos usuários.
Livros disponíveis para empréstimo.
 
Tecnologias Utilizadas
Linguagem: Java
Paradigma: Programação Orientada a Objetos (POO)
 
Este projeto é ideal para quem deseja aprender ou praticar conceitos de POO, como encapsulamento, herança e composição, além de manipulação de arquivos em Java.