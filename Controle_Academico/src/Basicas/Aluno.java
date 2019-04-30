package Basicas;

import java.util.Date;

public class Aluno {
	
	private int id; 
	private String nome; 
	private Date dataDeNascimento; 
	private int perido; 
	private String nomeUsuario; 
	private String senha;
	
	
	public Aluno(int id, String nome, Date dataDeNascimento, int perido, String nomeUsuario, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.perido = perido;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public int getPerido() {
		return perido;
	}
	public void setPerido(int perido) {
		this.perido = perido;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	} 
	
	
	
}