public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros on = new OrdenacaoNumeros();

        on.adicionarNumero(12);
        on.adicionarNumero(32);
        on.adicionarNumero(123);
        on.adicionarNumero(1);   
        on.adicionarNumero(2);
        on.adicionarNumero(421);
        on.adicionarNumero(2131);
        on.adicionarNumero(21);
        on.adicionarNumero(23);
        on.adicionarNumero(531);
        on.adicionarNumero(999);

        on.exibirNumeros();
        System.out.println(on.ordenarAscendente());
        System.out.println(on.ordenarDescendente());

   
   
    }
}
