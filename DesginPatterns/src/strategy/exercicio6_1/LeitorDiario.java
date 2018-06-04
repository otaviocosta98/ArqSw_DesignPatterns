package strategy.exercicio6_1;

public class LeitorDiario {
	
	private final MensagemDoDia mensagemDoDia;
	
	public LeitorDiario(MensagemDoDia mensagemDoDia) {
		this.mensagemDoDia = mensagemDoDia;
	}
	
	public void printMessage(String mensagem) {
		mensagemDoDia.printMessage(mensagem);
	}

}
