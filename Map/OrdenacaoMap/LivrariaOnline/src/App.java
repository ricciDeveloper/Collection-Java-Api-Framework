public class App {
    public static void main(String[] args) throws Exception {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("jjj", "Java", "Pressman", 119.90d);
        livraria.adicionarLivro("wwww", "Java- OO", "Juvito", 139.90d);
        livraria.adicionarLivro("sss", "Java- OO", "Abnel", 109.90d);
        livraria.adicionarLivro("ddd", "Java - 17", "Pressman", 19.90d);
        livraria.adicionarLivro("aaa", "Java - 10", "Pressman", 9.90d);
        livraria.adicionarLivro("bbb", "Java -12", "Pressman", 29.90d);
        livraria.exibirLivrosOrdenadosPorPreco();
        livraria.removerLivro("jjj");
        livraria.exibirLivrosOrdenadosPorPreco();
        livraria.pesquisarLivrosPorAutor("Pressman");
        System.out.println("O livro mais caro: "+livraria.obterLivroMaisCaro());
        System.out.println("O livro mais barato: "+ livraria.obterLivroMaisBarato());
    }
}
