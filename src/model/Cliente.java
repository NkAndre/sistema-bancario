package model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Cliente extends Pessoa {
	
	private int numeroConta;
	private double saldo;
	private double ativo;
	private String tipoConta;
	 private List<String> historico = new ArrayList<>();
	
	
	public Cliente (String name,int numeroConta) {
		this.name=name;
		this.numeroConta=numeroConta;
		this.saldo=0.0;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getAtivo() {
		return ativo;
	}
	public void setAtivo(double ativo) {
		this.ativo = ativo;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public List<String> getHistorico(){ 
		return historico;
	}
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String rg, LocalDate dataNasc, int numeroConta) {
	    super(nome, cpf, rg, dataNasc);
	    this.numeroConta = numeroConta;
	}

	
	public void depositar(double valor) {
		this.saldo +=valor;
		historico.add("Depósito: " +valor);
	}
	
	public void sacar(double valor) {
		this.saldo -=valor;
		historico.add("Saque: " +valor);
		
	}
	
    public void adicionarHistorico(String mensagem) {
        historico.add(mensagem);
    }
	
	
}
