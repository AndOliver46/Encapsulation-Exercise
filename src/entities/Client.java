package entities;

public class Client {
	private int numConta;
	private String nomeTitular;
	private double valorDisponivel;
	
	public Client(int numConta, String nomeTitular, double valorDisponivel) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.valorDisponivel = valorDisponivel;
	}

	public Client(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getValorDisponivel() {
		return valorDisponivel;
	}

	public void depositarValor(double valor) {
		this.valorDisponivel += valor;
	}
	
	public void sacarValor(double valor) {
		this.valorDisponivel = this.valorDisponivel - 5.00 - valor;
	}

	@Override
	public String toString() {
		return "\nDados da conta \nConta: " 
				+ numConta 
				+ ", Titular: " 
				+ nomeTitular 
				+ ", Saldo: " 
				+ String.format("%.2f", valorDisponivel);
	}
	
	
	
}
