import emprestimo.Emprestimo;
import leitor.Leitor;
import livro.Livro;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, "Romance");
        Livro livro2 = new Livro("A Revolução dos Bichos", "George Orwell", 1945, "Sátira política");


        Leitor leitor1 = new Leitor("João", 30, "12345");
        Leitor leitor2 = new Leitor("Maria", 25, "67890");


        Emprestimo emprestimo1 = new Emprestimo(livro1, leitor1, "2023-10-31", "2023-11-15");


        System.out.println("Livro 1: " + livro1.getTitulo() + " - Autor: " + livro1.getAutor());
        System.out.println("Leitor 1: " + leitor1.getNome() + " - Idade: " + leitor1.getIdade());
        System.out.println("Empréstimo 1: Livro: " + emprestimo1.getLivro().getTitulo() + " - Leitor: " + emprestimo1.getLeitor().getNome() + " - Data de Devolução: " + emprestimo1.getDataDevolucao());
    }
}
