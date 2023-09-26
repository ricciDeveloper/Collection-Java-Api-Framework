// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();
        dicionario.adicionarPalavra("abacate", "Fruta");
        dicionario.adicionarPalavra("Frango", "Animal, carne animal.");
        dicionario.adicionarPalavra("Gripe", "Doença");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("abacate");
        dicionario.removerPalavra("Gripe");

        dicionario.exibirPalavras();

        String palavraPesquisa = "Frango";

        String pesquisa = dicionario.pesquisarPorPalavra("Frango");
        System.out.println("Pesquisa de palavra : " + palavraPesquisa + " Descrição = " + pesquisa);
    }
}