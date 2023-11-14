public class Compra {
    private int idCompra;
    private String cpfComprador;
    private double valorTotal;
    private double valorFrete;

    public Compra(int idCompra, double valorTotal, double valorFrete) {
        this.idCompra = idCompra;
        this.valorTotal = valorTotal;
        this.valorFrete = valorFrete;
    }

    public String getCpfComprador() {
        return cpfComprador;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}
