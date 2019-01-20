package model;

import java.util.Date;
import java.util.List;

public class Pacote {

	private Pacote pacote;
	private String codigo;
	private Date dataExpedicao;
	private Date dataPrazo;
	private String tipo;
	private float valorPacote;
	private float valorEntrega;
	private String urgencia;
	private Endereco remetente;
	private Endereco destinatario;
	private List<Rastreio> rastreio;
	private double peso;
	private String dimensoes;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public Date getDataPrazo() {
		return dataPrazo;
	}

	public void setDataPrazo(Date dataPrazo) {
		this.dataPrazo = dataPrazo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValorPacote() {
		return valorPacote;
	}

	public void setValorPacote(float valorPacote) {
		this.valorPacote = valorPacote;
	}

	public float getValorEntrega() {
		return valorEntrega;
	}

	public void setValorEntrega(float valorEntrega) {
		this.valorEntrega = valorEntrega;
	}

	public String getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}

	public Endereco getRemetente() {
		return remetente;
	}

	public void setRemetente(Endereco remetente) {
		this.remetente = remetente;
	}

	public Endereco getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Endereco destinatario) {
		this.destinatario = destinatario;
	}

	public List<Rastreio> getRastreio() {
		return rastreio;
	}

	public void setRastreio(List<Rastreio> rastreio) {
		this.rastreio = rastreio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}


}
