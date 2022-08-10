/*****************************************************************************************************************
* Prova T�cnica Java --> Projeto 1 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.carro;

import br.com.proprietario.Proprietario;

public class Carro {

	/*
	 * Cria��o dos atributos da classe Carro, privates utilizados no encapsulamento
	 */
	private String modelo;
	private String cor;
	private int ano;
	private Marca marca;
	private String chassi;
	private Proprietario proprietario;
	private int velocidadeMaxima;
	private double velocidadeAtual;
	private int qtdePortas;
	private boolean tetoSolar;
	private int qtdeMarchas;
	private boolean cambioAutomatico;
	private double volumeCombustivel;

	// M�todo Construtor simples
	public Carro() {
		super();
	}

	// M�todo Construtor Completo
	public Carro(String modelo, String cor, int ano, Marca marca, String chassi, Proprietario proprietario,
			int velocidadeMaxima, double velocidadeAtual, int qtdePortas, boolean tetoSolar, int qtdeMarchas,
			boolean cambioAutomatico, double volumeCombustivel) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		//Parametro de proprietario
		this.proprietario = proprietario;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		this.qtdePortas = qtdePortas;
		this.tetoSolar = tetoSolar;
		this.qtdeMarchas = qtdeMarchas;
		this.cambioAutomatico = cambioAutomatico;
		this.volumeCombustivel = volumeCombustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public int getQtdeMarchas() {
		return qtdeMarchas;
	}

	public void setQtdeMarchas(int qtdeMarchas) {
		this.qtdeMarchas = qtdeMarchas;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public double getVolumeCombustivel() {
		return volumeCombustivel;
	}

	public void setVolumeCombustivel(double volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}

	// Implementa��o do m�todo acelerar
	public int acelerar(int valor) {
		this.velocidadeAtual = this.velocidadeAtual + valor;
		for (valor = 0; valor < 20; valor++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Acelerando " + valor + " KM/h");
		}
		System.out.println("Velocidade Atual igual a " + valor + "--> Velocidade M�xima Alcan�ada!");
		return 0;
	}

	// Implementa��o do m�todo frear
	public int frear(int valor) {
		this.velocidadeAtual = this.velocidadeAtual - valor;
		for (valor = 20; valor > 0; valor--) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Freando " + valor + " KM/h");
		}
		if (this.velocidadeAtual == 0) {
			System.out.println("\nVelocidade Atual igual a 0 --> Carro Parado!");
		}
		return 0;
	}

	

	public String trocarMarcha(int valor) {
		if (this.velocidadeAtual == 0) {
			System.out.println("Carro Parado!");
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			System.out.println("Carro na  1� Marcha");
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			System.out.println("Carro na 2� Marcha");
		}
		if (this.velocidadeAtual >= 80 && this.velocidadeAtual < 120) {
			System.out.println("Carro na 3� Marcha");
		}
		if (this.velocidadeAtual >= 120 && this.velocidadeAtual < 160) {
			System.out.println("Carro na 4� Marcha");
		}
		if (this.velocidadeAtual >= 160 && this.velocidadeAtual < 220) {
			System.out.println("Carro na 5� Marcha");
			System.out.println("oi");
		}
		return null;
	}

}
