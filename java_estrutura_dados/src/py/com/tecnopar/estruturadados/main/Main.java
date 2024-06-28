package py.com.tecnopar.estruturadados.main;

import java.util.Scanner;

import py.com.tecnopar.estruturadados.modelos.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite a opção desejada:");
		System.out.println("1.Gerenciamento de memória");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1: {
			MemoryManagement(option);	
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		scanner.close();
	}	
	private static void MemoryManagement(int value) {
		int a = value;
		System.out.println(a);	
		int b = a;
		System.out.println(b);
		b++;
		System.out.println("------------------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("------------------------------");
		System.out.println(a==b);
		System.out.println("******************************");
		Pessoa p1 = new Pessoa(1,"TecnoPar a ParaPar company");
		System.out.println("p1 = "+p1.toString());
		Pessoa p2 = p1;
		System.out.println("p2 = "+p2.toString());
		System.out.println("------------------------------");
		p2.setName("Rossatti Junior Tecnologia");
		System.out.println("p1 = "+p1.toString());		
		System.out.println("p2 = "+p2.toString());
	}

}
