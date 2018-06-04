package abstract_factory.exercicio1_1;

public class Run {

	public static void main(String[] args) {

		AbstractHelloWorld helloWorld = new PrintHelloWorld();
		helloWorld.printHelloWord();

		helloWorld = new WriteHelloWorld();
		helloWorld.printHelloWord();

	}

}
