package model;

import java.time.LocalDateTime;

public class Ligacao {
	//Atributos
	private int codigo;
	private String numTelDestino;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private String cidadeDestino;
	private String UFDestino;
	private Cliente cliente;
	
	//Metodos get e set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumTelDestino() {
		return numTelDestino;
	}
	public void setNumTelDestino(String numTelDestino) {
		this.numTelDestino = numTelDestino;
	}
	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public String getCidadeDestino() {
		return cidadeDestino;
	}
	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	public String getUFDestino() {
		return UFDestino;
	}
	public void setUFDestino(String uFDestino) {
		UFDestino = uFDestino;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//Metodo construtor
	public Ligacao(int codigo, String numTelDestino, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String cidadeDestino, String uFDestino, Cliente cliente) {
		this.codigo = codigo;
		this.numTelDestino = numTelDestino;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.cidadeDestino = cidadeDestino;
		UFDestino = uFDestino;
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Ligacao [codigo=" + codigo + ", numTelDestino=" + numTelDestino + ", dataHoraInicio=" + dataHoraInicio
				+ ", dataHoraFim=" + dataHoraFim + ", cidadeDestino=" + cidadeDestino + ", UFDestino=" + UFDestino
				+ ", cliente=" + cliente + "]";
	}
	
	
}
