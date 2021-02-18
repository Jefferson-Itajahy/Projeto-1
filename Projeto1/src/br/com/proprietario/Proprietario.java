/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 1 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.proprietario;

public class Proprietario {
	
	/*Criação dos atributos da classe Proprietário, 
	atributos privates utilizados no encapsulamento*/
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private Endereco endereco;
			
	public Proprietario() {
		super();
	}

	//Construtor com os campos nome, cpf e rg
	public Proprietario(String nome, String cpf, String rg) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	/*Criação dos Métodos Getters and Setters 
	--> utilizados para encapsulamento*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
