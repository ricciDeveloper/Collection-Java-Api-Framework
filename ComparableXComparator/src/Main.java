
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		ArrayList<Livroo> livros = new ArrayList<Livroo>() {
			{
				add(new Livroo("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
				add(new Livroo("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
						"Raoul-Gabriel Urma e  Richard Warburton", 2021));
				add(new Livroo(
						"Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
						"Susan J. Fowler", 2017));
				add(new Livroo("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
						"Aditya Y. Bhargava", 2017));
				add(new Livroo("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
			}
		};

		
		System.out.println("Livros após a ordenação natural (Título): ");
		Collections.sort(livros);
		for (Livroo livro : livros) {
			System.out.println(livro.getTitulo() + " - " +
					livro.getAutor() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano: ");
		Collections.sort(livros, new CompararAno());
		for (Livroo livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getTitulo() + " - " +
					livro.getAutor());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por autor: ");
		Collections.sort(livros, new CompararAutor());
		for (Livroo livro : livros) {
			System.out.println(livro.getAutor() + " - " +
					livro.getTitulo() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano, autor e título: ");
		Collections.sort(livros, new CompararAnoAutorTitulo());
		for (Livroo livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getAutor() + " - " +
					livro.getTitulo());
		}
	}
}