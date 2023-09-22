// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProduto cadastroProdutos = new CadastroProduto();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto("Qboa", 11L, 10d, 21);
        cadastroProdutos.adicionarProduto("Amaciante", 123L, 15d, 5);
        cadastroProdutos.adicionarProduto("Cigarro", 312L, 8d, 12);
        cadastroProdutos.adicionarProduto("Chocolate", 4512L, 5d, 24);
        cadastroProdutos.adicionarProduto("Perfume", 2L, 90d, 50);
        cadastroProdutos.adicionarProduto("Batata", 14L, 2d, 100);
        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.getProdutoSet());

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}