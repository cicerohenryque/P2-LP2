import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SistesmaXaBuMDescontos {
    private HashMap<String, Usuario> usuarios;
    private ArrayList<Cumpo> cupons;

    public SistesmaXaBuMDescontos(){
        this.usuarios = new HashMap<>();
        this.cupons = new ArrayList<>();
    }
    public String criaCupomFreteGratis(double maxDesconto){
        Cumpo cumpo = new CupomFreteGratis(maxDesconto);
        cupons.add(cumpo);

        return "Desconto de até R$" + maxDesconto + " no Frete";
    }
    public String criaCupomFreteGratis(){
        Cumpo cumpo = new CupomFreteGratis();
        cupons.add(cumpo);

        return "FreteGratis";
    }
    public String criaCupomDescontoFixo(double percentualDesconto, double maxDesconto){
        Cumpo cumpo = new CupomDescontoFixo(percentualDesconto, maxDesconto);
        cupons.add(cumpo);

        return "Desconto Fixo de " + percentualDesconto + "%, até no máximo R$ "+ maxDesconto;
    }
    public String criaCupomDescontoProgressivo(){
        Cumpo cumpo = new CupomDescontoProgressivo();
        cupons.add(cumpo);

        return "Desconto Progressivo, 1%, 5%ou 10%";
    }
    public String adicionaUsuario(String cpf, String nome){
        if(usuarios.containsKey(cpf)){
            return "Usuario ja cadastrado.";
        }
        Usuario user = new Usuario(nome, cpf);
        usuarios.put(cpf, user);

        return "Usuario cadastrado com sucesso.";
    }
    public String addCupomUsuario(String cpf, int indexCupom){
        Usuario user = usuarios.get(cpf);
        Cumpo cup = cupons.get(indexCupom);
        if(user == null || cup == null){
            return "Usuario ou Cupom invalido";
        }
        user.adicionaCupom(cup.getDescricao());
        cupons.remove(indexCupom);

        return "Cupom adicionado.";
    }
    public String aplicarDescontoCompra(Compra minhaCompra, int indexCupomUsuario){
        String cpf = minhaCompra.getCpfComprador();
        Usuario user = usuarios.get(cpf);

        if(user == null){
            return "Usuario invalido";
        }
        if(cupons.get(indexCupomUsuario) == null){
            return "Cupom Invalido";
        }

        cupons.get(indexCupomUsuario).aplicarDesconto(minhaCompra);
        user.removeCupom(indexCupomUsuario);

        return "Desconto aplicado";
    }
    public String listarCuponsUsuario(String cpf){
        Usuario user = usuarios.get(cpf);

        if(user == null){
            return "Usuario invalido";
        }

        return user.getNome() + " - " + user.getCpf() + "\n" + user.getQtdTotal() + " cupons - " + user.getCupons() + " cupons ativos";
    }
    public List<String> listarUsuariosPorNome(){
        List<Usuario> usuariosOrdenadosPorNome = new ArrayList<>(usuarios.values());
        List<String> lista = new ArrayList<>();
        for(Usuario usuario: usuariosOrdenadosPorNome){
            lista.add(usuario.getNome());
        }

        return lista;
    }
    public List<String> listarUsuariosPorCuponsTotais(){
        List<Usuario> usuariosCup = new ArrayList<>(usuarios.values());
        List<String> lista = new ArrayList<>();
        for(Usuario usuario: usuariosCup){
            lista.add(String.valueOf(usuario.getCupons()));
        }

        return lista;
    }
}
