package documin;

/**
 * 
 * @author Cicero Henryque Pereira Rocha - 120111082.
 *
 */
public class Texto extends ElementoAbstract {
	
	/**
	 * 
	 * Constroi um texto a partir da prioridade e valor.
	 * 
	 * @param prioridade prioridade do texto.
	 * @param valor valor do texto.
	 */
	public Texto(int prioridade, String valor) {
		super(prioridade, valor);
	}
	
	/**
	 * Método que gera a representação completa do texto.
	 * 
	 * @return uma representação completa em String do texto.
	 */
	public String gerarRepresentacaoCompleta() {
		return super.getValor();
	}

	/**
	 * Método que gera a representação resumida do texto.
	 * 
	 * @return uma representação resumida em String do texto.
	 */
	public String gerarRepresentacaoResumida() {
		return super.getValor();
	}
	
}
