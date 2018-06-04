package strategy.exercicio6_1;

public class MensagemSabado implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("SABADO: " + mensagem);
	}

}
