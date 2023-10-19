import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelCaliforniaFacade {
    private Map <String, Instalacao> instalacaoMap;
    private List <Reserva> reservas;
    private Map <String, Boolean> ocupacao;

    public HotelCaliforniaFacade() {
        this.instalacaoMap = new HashMap<>();
        this.reservas = new ArrayList<>();
        this.ocupacao = new HashMap<>();
    }

    public String cadastrarInstalacao(String id, String descricao, Integer capacidade, Double preco){
        if(instalacaoMap.containsKey(id)){
            return id + " está ocupada!";
        }

        Instalacao inst = new Instalacao(id, descricao, capacidade, preco);
        instalacaoMap.put(id, inst);

        return inst.toString();
    }
    public String reservarInstalacao(String idInstalacao, Integer quantidadeDiarias, String nomeCliente, String documentoCliente, String tipoDeReserva){
        if(reservas.contains(idInstalacao)){
            return idInstalacao + " está ocupada!";
        }
        Reserva reser = new Reserva(idInstalacao, quantidadeDiarias, nomeCliente, documentoCliente, tipoDeReserva);
        if(!estaLivre(idInstalacao)) {
            reservas.add(reser);
            ocupacao.put(idInstalacao, true);
        }
        return reser.toString();
    }

    public String liberarReserva(String idInstalacao){
        if (ocupacao.containsKey(idInstalacao)){
            ocupacao.remove(idInstalacao);
        }

        return "Reserva Liberada!";
    }
    public String consultarReservas(String nomeCliente){
        int index;
        for(int i = 0; i <= reservas.size(); i++){
            if (nomeCliente.equals(reservas.get(i).getNomeCliente())){
                index = i;
            }
        }

        return reservas.get(index).toString();
    }
    public String cancelarReserva(String idReserva){
        if(reservas.contains(idReserva)) {
            reservas.remove(idReserva);
        }
        return reservas.toString();
    }
    private Boolean estaLivre(String idInstalacao){
        return ocupacao.containsKey(idInstalacao);
    }
}