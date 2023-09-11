import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo da classe para realizar as compras

    private List<Itens> comprasList;

    //Construtor sem parâmetros, para iniciar um array vazio sempre que for instanciado este objeto.

    public CarrinhoDeCompras(){
        this.comprasList = new ArrayList<>();
    }
    //Método para adicionar itens ao carrinho, passando como parametros 3 informações obrigatórias
    public void adicionarItens(String nome, double preco, int quantidade){
        //Instanciação do objeto
        Itens item = new Itens(nome, preco, quantidade);
        comprasList.add(new Itens(nome, preco, quantidade));
    }

    public void ExibirItens(){
        if(!comprasList.isEmpty()){
            System.out.println(comprasList);
        }else{
            System.out.println("Carrinho vazio.");
        }
    }
    public void removerItem(String nome){
        List<Itens> itensForRemove = new ArrayList<>();
        if(!itensForRemove.isEmpty()){
            for(Itens i : comprasList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensForRemove.add(i);
                }
            }
            comprasList.removeAll(itensForRemove);
        }else{
            System.out.println("Carrinho de compras vazio");
        }
    }
    public double CalcularValorItens(){
        double valorTotal = 0d;
        if(!comprasList.isEmpty()){
            for(Itens item : comprasList ){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia");
        }

    }

    @Override
    public String toString(){
        return "CarrinhoDeCompras{ " + "itens = " + comprasList + '}';

    }
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItens("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItens("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItens("Borracha", 2d, 2);
        carrinhoDeCompras.adicionarItens("Caderno", 35d, 1);
    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.ExibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.ExibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.CalcularValorItens());
      }
}

