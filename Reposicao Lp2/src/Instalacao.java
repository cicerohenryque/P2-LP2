import java.util.Objects;

public class Instalacao {
    private String id;
    private String descricao;
    private int capacidade;
    private double preco;

    public Instalacao (String id, String descricao, int capacidade, double preco){
        this.id = id;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return ":: " + id + ":: R$" + preco + " (diária padrão) :: máx " + capacidade + " pessoas ::\n"
                + "== " + descricao + " ==";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instalacao that)) return false;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
