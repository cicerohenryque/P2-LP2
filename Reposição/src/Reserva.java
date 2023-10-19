public class Reserva {
    private String id;
    private Integer quantidadeDiarias;
    private String nomeCliente;
    private String documentoCliente;
    private String tipoDeReserva;
    private Instalacao instalacao;

    public Reserva(String id, Integer quantidadeDiarias, String nomeCliente, String documentoCliente, String tipoDeReserva) {
        this.id = id;
        this.quantidadeDiarias = quantidadeDiarias;
        this.nomeCliente = nomeCliente;
        this.documentoCliente = documentoCliente;
        this.tipoDeReserva = tipoDeReserva;
    }

    public String getId() {
        return this.id;
    }

    public Integer getQuantidadeDiarias() {
        return this.quantidadeDiarias;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public String getDocumentoCliente() {
        return this.documentoCliente;
    }

    public String getTipoDeReserva() {
        return this.tipoDeReserva;
    }

    private Double valorTotal(){
        Double valortotal = (instalacao.getPreco() * this.quantidadeDiarias);
        if (this.tipoDeReserva.equals("taxa balcão")){
            valortotal *= 1.2;
        } else if (this.tipoDeReserva.equals("premium")){
            valortotal *= 0.9;
        }
        return valortotal;
    }
    private String tipo(String tipoDeReserva){
        String retorno = "";
        if (tipoDeReserva == "premium"){
            retorno = "-10%";
        } else{
            retorno = "+20%";
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Reserva nº ## " + this.id + " ##\n"
                + "#### Dados da instalação ####\n" +
                instalacao.toString() + "\n" +
                "-----------------------------" + "\n" +
                "Em favor de " + this.nomeCliente + "," + " CPF: " + this.documentoCliente + "\n" +
                "#### Valor Total: " + this.valorTotal() + " (" + this.tipoDeReserva + this.tipo(this.tipoDeReserva) + "), "
                + this.quantidadeDiarias + " diária ####";
    }
}
