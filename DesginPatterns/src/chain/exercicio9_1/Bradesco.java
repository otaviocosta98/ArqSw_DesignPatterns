package chain.exercicio9_1;

public class Bradesco extends BancoChain {
	 
    public Bradesco() {
        super(IDBancos.Bradesco);
    }
 
    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no Bradesco");
    }
}
