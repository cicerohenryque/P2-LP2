import java.util.Objects;

public class Reserva {
    private static long nextId = 1;
    private String id;
    private int quantidadeDiarias;
    private String nomeCliente;
    private String documentoCliente;
    private String tipoDeReserva;
    private Instalacao instalacao;
    private double precoTotal;

    public Reserva(Instalacao instalacao, int quantidadeDiarias, String nomeCliente, String stringdocumentoCliente, String tipoDeReserva) {
        this.id = nextId++;
        this.quantidadeDiarias = quantidadeDiarias;
        this.nomeCliente = nomeCliente;
        this.documentoCliente = stringdocumentoCliente;
        this.tipoDeReserva = tipoDeReserva;
        this.instalacao = instalacao;
    }

    public static long getNextId() {
        return nextId;
    }

    public String getId() {
        return id;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public String getTipoDeReserva() {
        return tipoDeReserva;
    }

    public Instalacao getInstalacao() {
        return instalacao;
    }
    public double getPrecoTotal {
        this.precoTotal = instalacao.getPreco() * quantidadeDiarias;
        if (tipoDeReserva.equals("Taxa Balcão")){
            precoTotal = precoTotal * 1.2;
        } else if (tipoDeReserva.equals("Premium")) {
            precoTotal = precoTotal * 0.9;
        }
        return getPrecoTotal;
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        saida.append("Reserva nº ## ").append(id).append(" ##\n#### Dados da instalação ####\n");
        saida.append(instalacao.toString()).append("\n----------------------------\n");
        saida.append("Em favor de ").append(nomeCliente).append(", ").append(documentoCliente"\n");
        saida.append("#### Valor Total: R$").append(getPrecoTotal).append(", ").append(quantidadeDiarias).append(" diária(s) ####");

        return saida.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva reserva)) return false;
        return getTipoDeReserva().equals(reserva.getTipoDeReserva());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipoDeReserva());
    }
}
