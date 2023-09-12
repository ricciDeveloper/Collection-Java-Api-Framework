public class App {
    public static void main(String[] args) throws Exception {
        //Instanciando o objeto
        SomaNumeros sn = new SomaNumeros();
        //Adicionando numeros na lista, pelo metodo
        sn.adicionarNumero(10);
        sn.adicionarNumero(20);
        sn.adicionarNumero(123);
        sn.adicionarNumero(213);

        //Exibindo a lista de numeros adicionados
        System.out.println("Números adicionados na lista: ");
        sn.exibirNumeros();
        

        //Calculando e exibindo a soma dos números na lsita
        System.out.println("Soma dos números = " + sn.calcularSoma());
        //Encontrando e exibindo maior numero na lista
        System.out.println("Maior número da lista = " + sn.encontrarMaiorNumero());

        //Encontrando menor numero na lsita
        System.out.println("Menor número = " + sn.encontrarMenorNumero());
    }


}
