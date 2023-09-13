public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("nome 1 " , 12 , 1.72);
        ordenacao.adicionarPessoa("nome 2 " , 20 , 1.52);
        ordenacao.adicionarPessoa("nome 3 " , 32 , 1.70);
        ordenacao.adicionarPessoa("nome 4 " , 15 , 1.92);
        ordenacao.adicionarPessoa("nome 5 " , 18 , 1.53);
        ordenacao.adicionarPessoa("nome 6 " , 45 , 1.90);
        ordenacao.adicionarPessoa("nome 7 " , 22 , 1.60);
        ordenacao.adicionarPessoa("nome 8 " , 67 , 1.81);
        System.out.println(ordenacao.getPessoaList());
        
        //System.out.println(ordenacao.ordenarPorIdade());
        //System.out.println(ordenacao.ordenarPorAltura());
    }
}
