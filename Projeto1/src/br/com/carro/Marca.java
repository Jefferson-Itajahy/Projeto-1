/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 1 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.carro;

public class Marca {
	
	private String marca;
	private int nrDeModelos;
	private int anoLancamento;
	private int codigoIdentificador;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNrDeModelos() {
		return nrDeModelos;
	}
	public void setNrDeModelos(int nrDeModelos) {
		this.nrDeModelos = nrDeModelos;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}
	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
}
