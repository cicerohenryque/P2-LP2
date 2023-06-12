package documin;

import java.util.Comparator;

/**
 * 
 *
 * @author Cicero Henryque Pereira Rocha - 120111082.
 *
 */
public class TermosOrdenaTamanho implements Comparator<String>{

	/**
	 * Ordena o elemento Termo a partir do tamanho da palavra.
	 * 
	 * @param o1 objeto um.
	 * @param o2 objeto dois.
	 */
	@Override 
	public int compare(String o1, String o2) {
		return o2.length() - o1.length();
	}
}