import java.util.List;
import java.util.Objects;

public class Usuario {
    private String nome;
    private String cpf;
    private int cupons = 0;
    private int qtdTotal = 0;
    private List<String> listaCupons;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCupons() {
        return cupons;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void adicionaCupom(String cupom){
        listaCupons.add(cupom);
        cupons += 1;
        qtdTotal += 1;
    }

    public void removeCupom(int cupom){
        listaCupons.remove(cupom);
        cupons -= 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(cpf, usuario.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return nome + " - " + cpf + "\n";
    }
}
