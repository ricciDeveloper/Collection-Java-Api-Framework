
    //Classe para comparar Livro por Ano

import java.util.Comparator;

class CompararAno implements Comparator<Livroo>{
        @Override
        public int compare(Livroo l1, Livroo l2){
            return Integer.compare(l1.getAno(), l2.getAno());

            
        }
    }
