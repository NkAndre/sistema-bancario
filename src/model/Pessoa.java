package model;

import java.time.LocalDate;

public class Pessoa {
	
	protected String name;
	protected String cpf;
	protected String rg;
	protected LocalDate dataNasc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public Pessoa() {}
	public Pessoa(String name, String cpf, String rg, LocalDate dataNasc) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
	}
	

}
