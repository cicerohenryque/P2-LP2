import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelCaliforniaFacade {
    private Map<String, Instalacao> instalacoes;
    private List<Reserva> reservas;
    private Map<String, Boolean> ocupacao;

    public HotelCaliforniaFacade() {
        instalacoes = new HashMap<>();
        reservas = new ArrayList<>();
        ocupacao = new HashMap<>();
    }

    public String cadastrarInstalacao(String id, String descricao, int capacidade, double preco){
        if(instalacoes.containsKey(id)){
            return id + " está ocupado!";
        }
        Instalacao instalacao = new Suite(id, descricao, capacidade, preco);
        return instalacao.toString();
    }

    public String reservarInstalacao(String idInstalacao, int quantidadeDiarias, String nomeCliente, String documentoCliente, String tipoDeReserva){
        if(!instalacoes.containsKey(idInstalacao)){
            return idInstalacao + " não encontrado!";
        }
        if(ocupacao.getOrDefault(idInstalacao, false)){
            return idInstalacao + " está ocupado";
        }
        Instalacao instalacao = instalacoes.get(idInstalacao);
        Reserva reserva = new Reserva(instalacao, quantidadeDiarias, nomeCliente, documentoCliente, tipoDeReserva);
        reservas.add(reserva);
        ocupacao.put(idInstalacao, true);

        return reserva.toString();
    }
    public String liberarReserva(String idInstalacao){
        if (!ocupacao.containsKey(idInstalacao)) {
            return idInstalacao + " não encontrada.";
        }

        ocupacao.put(idInstalacao, false);

        return idInstalacao + " liberada.";
    }
    public String consultarReservas(String nomeCliente){
        StringBuilder sb = new StringBuilder();
        boolean ativasExibidas = false;
        boolean historicoExibido = false;

        sb.append(":: Ativas ::\n");
        for (Reserva reserva : reservas) {
            if (reserva.getNomeCliente().equals(nomeCliente)) {
                if (!ativasExibidas) {
                    sb.append("(nenhuma reserva)\n");
                    ativasExibidas = true;
                }
                if (reserva.getQuantidadeDiarias() > 0) {
                    sb.append("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
                    sb.append(reserva.toString()).append("\n");
                    sb.append("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
                }
            }
        }

        sb.append("\n:: Histórico de Reservas ::\n");
        for (Reserva reserva : reservas) {
            if (reserva.getNomeCliente().equals(nomeCliente)) {
                if (reserva.getQuantidadeDiarias() == 0) {
                    if (!historicoExibido) {
                        historicoExibido = true;
                    }
                    sb.append("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
                    sb.append(reserva.toString()).append("\n");
                }
            }
        }

        return sb.toString();
    }
    public String cancelarReserva(Long idReserva){
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
                reservas.remove(reserva);
                return "Reserva " + idReserva + " cancelada.";
            }
        }
        return "Reserva com ID " + idReserva + " não encontrada.";
    }
    private boolean estaLivre(String idInstalacao){
        return !ocupacao.getOrDefault(idInstalacao, false);
    }

}
