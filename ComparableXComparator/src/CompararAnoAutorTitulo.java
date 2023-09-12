import java.util.Comparator;

class CompararAnoAutorTitulo implements Comparator<Livroo> {
	@Override
	public int compare(Livroo l1, Livroo l2) {
		int ano = Integer.compare(l1.getAno(), l2.getAno());
		if (ano != 0)
			return ano;
		int autor = l1.getAutor().compareTo(l2.getAutor());
		if (autor != 0)
			return autor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}
