package model;

import java.util.List;

public class CaixaPostal {

	private String espacoMax;
	private double pesoMax;
	private List<Pacote> pacotes;
	private Endereco endereco;

	public String getEspacoMax() {
		return espacoMax;
	}

	public void setEspacoMax(String espacoMax) {
		this.espacoMax = espacoMax;
	}

	public double getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
