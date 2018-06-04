package observer.exercicio8_1;

public class Run {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int novaEdicao = 10;
		Noticiario revistaInformatica = new Noticiario();		
		Assinante1 assinante1 = new Assinante1(revistaInformatica);
		
		revistaInformatica.setNovaEdicao(novaEdicao);
	}

}
