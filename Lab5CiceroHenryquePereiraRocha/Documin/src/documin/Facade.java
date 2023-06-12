package documin;

/**
 * 
 * Classe que controla o sistema.
 * 
 * @author Cicero Henryque Pereira Rocha - 120111082.
 *
 */
public class Facade {

    private DocumentoController documentoController;

    public Facade() { 
        this.documentoController = new DocumentoController();
    }

    public boolean criarDocumento(String titulo) {
    	boolean cadastro =  this.documentoController.adicionaDocumento(titulo);
        if(cadastro) {
        	return true;
        } else { 
        	return false;
        }
    }

    public boolean criarDocumento(String titulo, int tamanhoMaximo) {
    	boolean cadastro =  this.documentoController.adicionaDocumento(titulo, tamanhoMaximo);
        if(cadastro) {
        	return true; // cadastrado.
        } else { 
        	return false; // não cadastrado.
        }
    }

    public boolean moverParaBaixo(String tituloDoc, int elementoPosicao) {
    	return this.documentoController.moverParaBaixo(tituloDoc, elementoPosicao);
    }

    public boolean moverParaCima(String tituloDoc, int elementoPosicao) {
    	return this.documentoController.moverParaCima(tituloDoc, elementoPosicao);
    }

	public String pegarRepresentacaoResumida(String tituloDoc, int elementoPosicao) {
		return this.documentoController.pegarRepresentacaoResumida(tituloDoc, elementoPosicao);
	}

	public String pegarRepresentacaoCompleta(String tituloDoc, int elementoPosicao) {
		return this.documentoController.pegarRepresentacaoCompleta(tituloDoc, elementoPosicao);
	}

    public String[] exibirDocumento(String titulo) {
    	return this.documentoController.exibirDocumento(titulo);
    }

    public boolean apagarElemento(String titulo, int elementoPosicao) {
    	return this.documentoController.apagarElemento(titulo, elementoPosicao);
    }

    public void removerDocumento(String titulo) {
    	this.documentoController.removerDocumento(titulo);
    }

    public int criarTexto(String tituloDoc, String valor, int prioridade) {
    	return this.documentoController.criarTexto(tituloDoc, valor, prioridade);
    }

    public int criarTitulo(String tituloDoc, String valor, int prioridade, int nivel, boolean linkavel) {
    	return this.documentoController.criarTitulo(tituloDoc, valor, prioridade, nivel, linkavel);
    }
    
    public int criarLista(String tituloDoc, String valorLista, int prioridade, String separador, String charLista) {
    	return this.documentoController.criarLista(tituloDoc, valorLista, prioridade, separador, charLista);
    }

    public int criarTermos(String tituloDoc, String valorTermos, int prioridade, String separador, String ordem) {
    	return this.documentoController.criarTermos(tituloDoc, valorTermos, prioridade, separador, ordem);
    }

    public int criarAtalho(String tituloDoc, String tituloDocReferenciado) {
    		return this.documentoController.criarAtalho(tituloDoc, tituloDocReferenciado);
    }

    public int criarVisaoCompleta(String tituloDoc) {
    	return this.documentoController.criarVisaoCompleta(tituloDoc);
    }

    public int criarVisaoResumida(String tituloDoc) {
    	return this.documentoController.criarVisaoResumida(tituloDoc);
    }

    public int criarVisaoPrioritaria(String tituloDoc, int prioridade) {
    	return this.documentoController.criarVisaoPrioritaria(tituloDoc, prioridade);
    }

    public int criarVisaoTitulo(String tituloDoc) {
    	return this.documentoController.criarVisaoTitulo(tituloDoc);
    }

    public String[] exibirVisao(int visaoId) {
    	return this.documentoController.exibirVisao(visaoId);
    }
}
