import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributo, com lista de números inteiros.
    private List<Integer> numeros;

    //Construtor
    //iniciando um array vazio para que possa ser adicionado os numeros na lista

    public SomaNumeros(){
        this.numeros = new ArrayList<>();

    }
    
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for (Integer n : numeros) {
               soma += n; 
            }
        }else{
            throw new RuntimeException("Lista de números vazia");
        }
       return soma; 
    }
    
    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for (Integer n : numeros) {
                if( n >= maiorNumero){
                    maiorNumero = n;
                }
            }
        }else{
                throw new RuntimeException("Lista de números vazia");

        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
                int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for (Integer n : numeros) {
                if( n <= menorNumero){
                    menorNumero = n;
                }
            }
        }else{
                throw new RuntimeException("Lista de números vazia");

        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("Lista vazia.");
        }
    }
}
