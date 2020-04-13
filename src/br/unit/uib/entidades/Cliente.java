package br.unit.uib.entidades;

public class Cliente {
	
	
	private String cpf;
	private String nome;
	
	public Cliente() {
	}
	
	public Cliente(String cpf, String nome) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
