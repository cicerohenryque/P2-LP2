package documin;

import java.util.Comparator;

/**
 * 
 * @author Cicero Henryque Pereira Rocha - 120111082.
 *
 */
public class TermosOrdenaAlfabetico implements Comparator<String>  {

	/**
	 * Ordena o elemento Termo com base na lexicografia.
	 * 
	 * @param o1 objeto um.
	 * @param o2 objeto dois.
	 */
	@Override
	public int compare(String o1, String o2) {
		return o1.toLowerCase().compareTo(o2.toLowerCase());
	}
}
