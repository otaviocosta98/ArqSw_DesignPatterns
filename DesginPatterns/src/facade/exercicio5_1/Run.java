package facade.exercicio5_1;

public class Run {

	public static void main(String[] args) {
		IOFacade iof = new IOFacade();
		byte[] byteArray = { 10, 20, 30, 40, 50, 60, 70, 80 };
		iof.gravarArquivoBinario("teste.bin", byteArray);
		iof.lerArquivoBinario("teste.bin");
	}
}
