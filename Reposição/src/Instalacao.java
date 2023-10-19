public class Instalacao {
    private String id;
    private String descricao;
    private int capacidade;
    private double preco;

    public Instalacao(String id, String descricao, int capacidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    public String getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return ":: " + this.id + ":: R$" + this.preco + " (diária padrão) :: máx " + this.capacidade + " pessoas ::\n"
                + "== " + this.descricao + " ==";
    }
}