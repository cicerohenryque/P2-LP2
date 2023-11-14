public class CupomFreteGratis implements Cumpo{
    private double maxDesconto;
    private int indexCupom = 0;

    public CupomFreteGratis(double maxDesconto) {
        this.maxDesconto = maxDesconto;
        this.indexCupom += 1;
    }

    public CupomFreteGratis() {
        this.indexCupom += 1;
    }

    public void aplicarDesconto(Compra compra){
        if(maxDesconto == 0) {
            compra.setValorFrete(0);
        } else{
            double frete = compra.getValorFrete() - maxDesconto;
            compra.setValorFrete(frete);
        }
    }

    public int getIdCupom() {
        return indexCupom;
    }

    public String getDescricao(){
        return "Frete Gratis";
    }
}
