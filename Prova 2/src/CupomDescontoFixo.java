public class CupomDescontoFixo implements Cumpo{
    private double percentualDesconto;
    private double maxDesconto;
    private int indexCupom = 0;

    public CupomDescontoFixo(double percentualDesconto, double maxDesconto) {
        this.percentualDesconto = percentualDesconto;
        this.maxDesconto = maxDesconto;
        this.indexCupom += 1;
    }

    public void aplicarDesconto(Compra compra){
        double valor = compra.getValorTotal() * (percentualDesconto / 100);
        if(valor <= maxDesconto){
            double desconto = compra.getValorTotal() - valor;
            compra.setValorTotal(desconto);
        }
    }

    public int getIdCupom() {
        return indexCupom;
    }

    public String getDescricao(){
        return "Desconto Fixo";
    }
}
