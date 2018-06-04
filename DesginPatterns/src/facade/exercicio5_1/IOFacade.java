package facade.exercicio5_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//TODO implementar pares de grava��o para arquivos texto(BufferReader) e objeto(ObjectInputStream) conforme os m�todos abaixo;
//	usar o material da aula 11 de pratprog como exemplo
public class IOFacade {

	public void gravarArquivoBinario(String nome, byte[] conteudo) {
		File outFile = new File(nome);
		try {
			FileOutputStream outStream = new FileOutputStream(outFile);
			outStream.write(conteudo);
			outStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void lerArquivoBinario(String nome) {
		File inFile = new File(nome);
		try {
			FileInputStream inStream = new FileInputStream(inFile);
			int tamanho = (int) inFile.length();
			byte[] conteudo = new byte[tamanho];
			inStream.read(conteudo);
			for (int i = 0; i < conteudo.length; i++) {
				System.out.println(conteudo[i]);
			}
			inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lerArquivoTexto(String nome) {
		File inFile = new File("sample3.data");
		try {
			FileReader fileReader = new FileReader(inFile);
			BufferedReader bufReader = new BufferedReader(fileReader);
			while (bufReader.readLine() != null) {
				System.out.println(bufReader.readLine());
			}
			bufReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void gravarObjeto(String nome, Object objeto) {
		File outFile = new File("objects.dat");
		try {
			FileOutputStream outFileStream = new FileOutputStream(outFile);
			ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
			outObjectStream.writeObject(objeto);
			outObjectStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lerObjeto(String nome) {
		File inFile = new File("objects.dat");
		try {
			FileInputStream inFileStream = new FileInputStream(inFile);
			ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
			Object objeto;
			for (int i = 0; i < 10; i++) {
				objeto = inObjectStream.readObject();
				System.out.println(objeto);
			}
			inObjectStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
