    //Classe para comparar Livro por autor

import java.util.Comparator;

class CompararAutor implements Comparator <Livroo>{
        @Override
        public int compare (Livroo l1, Livroo l2){
            return l1.getAutor().compareTo(l2.getAutor());
        }
        
    }
