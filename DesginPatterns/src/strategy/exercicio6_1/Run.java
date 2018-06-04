package strategy.exercicio6_1;

public class Run {
	
	public static void main(String[] args) {
		MensagemDoDia mensagemDoDia = new MensagemSegunda();
		LeitorDiario leitor = new LeitorDiario(mensagemDoDia);
		leitor.printMessage("aff");
		
		mensagemDoDia = new MensagemTerca();
		leitor = new LeitorDiario(mensagemDoDia);
		leitor.printMessage("mais aff");
		
		mensagemDoDia = new MensagemQuarta();
		leitor = new LeitorDiario(mensagemDoDia);
		leitor.printMessage("ta chegando");
		
		mensagemDoDia = new MensagemQuinta();
		leitor = new LeitorDiario(mensagemDoDia);
		leitor.printMessage("quase sexta");
		
		mensagemDoDia = new MensagemSexta();
		leitor = new LeitorDiario(mensagemDoDia);
		leitor.printMessage("sextou");
		
		mensagemDoDia = new MensagemSabado();
		leitor = new LeitorDiario(mensagemDoDia);
		leitor.printMessage("acordar cedo aff");
		
		mensagemDoDia = new MensagemDomingo();
		leitor = new LeitorDiario(mensagemDoDia);
		leitor.printMessage("outro aff");
	}

}
