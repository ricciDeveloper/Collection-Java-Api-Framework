import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args)  {
       //exemplo sem GENERICS
       List listaSemGenerics = new ArrayList<>();
       listaSemGenerics.add("Elemento 1");
       listaSemGenerics.add("10");//Permite adicionar qualquer tipo de objeto

       //exemplo com Generics

       List<String> listaGenerics = new ArrayList<>();
       listaGenerics.add("Elemento 1");
       listaGenerics.add("12");//Qualquer tipo que não seja String, não será aceito
       //está determinado pelo operador diamond apenas aceitação de STRING

       //Iterando sobre a lista com Generics
       for (String elemento : listaGenerics){
        System.out.println(elemento);
       }

       //Iterando sobre a lista sem generics(necessário fazer Cast)
       for (Object elemento : listaSemGenerics){
        String str = (String) elemento;
        System.out.println(str);
       }
    }
}
