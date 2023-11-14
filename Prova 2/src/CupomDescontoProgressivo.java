public class CupomDescontoProgressivo implements Cumpo{
    private int indexCupom = 0;

    public CupomDescontoProgressivo() {
        this.indexCupom += 1;
    }

    public int getIdCupom() {
        return indexCupom;
    }

    public void aplicarDesconto(Compra compra){
        double valorCompra = compra.getValorTotal();
        if(valorCompra <= 100) {
            double desconto = compra.getValorTotal() - (compra.getValorTotal() * 0.01);
            compra.setValorTotal(desconto);
        } else if(valorCompra <= 500) {
            double novo = compra.getValorTotal() - (compra.getValorTotal() * 0.05);
            compra.setValorTotal(novo);
        } else if(valorCompra > 500){
            double valor = compra.getValorTotal() - (compra.getValorTotal() * 0.1);
            compra.setValorTotal(valor);
        }
    }

    public String getDescricao(){
        return "Desconto Progessivo";
    }
}
