package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		int numConta;
		String nomeTitular;
		double valorDeposito;
		Client client;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o n�mero da conta a ser cadastrada: ");
		numConta = sc.nextInt();
		System.out.print("Informe o nome do titular da conta: ");
		sc.nextLine();
		nomeTitular = sc.nextLine();
		System.out.print("O cliente deseja realizar o dep�sito inicial? [S/N]");
		String opcoesDeposito = sc.nextLine();
		
		if(opcoesDeposito.equals("S") || opcoesDeposito.equals("s")) {
			System.out.println("Informe o valor do dep�sito inicial: ");
			valorDeposito = sc.nextDouble();
			client = new Client(numConta, nomeTitular, valorDeposito);
		}else {
			System.out.println("O cliente optou por n�o depositar nenhum valor!");
			client = new Client(numConta, nomeTitular);
		}
		System.out.println(client);
		
		System.out.print("\nInforme o valor de dep�sito: ");
		client.depositarValor(sc.nextDouble());
		System.out.println(client);
		
		System.out.print("\nInforme o valor de saque: ");
		client.sacarValor(sc.nextDouble());
		System.out.println(client);
		sc.close();
	}

}
