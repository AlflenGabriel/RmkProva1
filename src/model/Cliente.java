package model;

import java.time.LocalDate;

public class Cliente {
	//Atributos
	private String nome;
	private String CPF;
	private LocalDate dataNascimento;
	private String numTelefone;
	private String cidade;
	private String UF;
	
	//Metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	//Metodo construtor
	public Cliente(String nome, String cPF, LocalDate dataNascimento, String numTelefone, String cidade, String uF) {
		this.nome = nome;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.numTelefone = numTelefone;
		this.cidade = cidade;
		UF = uF;
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\n" + "CPF: " + this.CPF;
	}
	
	
}
