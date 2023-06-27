public class Suite extends Instalacao {
    public Suite(String id, String descricao, int capacidade, double preco) {
        super(id, descricao, capacidade, preco);
    }

    @Override
    public String toString() {
        return ":: " + Instalacao.getId() + ":: R$" + Instalacao.getPreco() + " (diária padrão) :: máx " + Instalacao.getCapacidade() + " pessoas ::\n"
                + "== " + Instalacao.getDescricao() + " ==";
    }
}
