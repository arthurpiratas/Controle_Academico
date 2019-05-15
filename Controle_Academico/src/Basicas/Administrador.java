package Basicas;

import java.util.Date;

public class Administrador {
	private int id; 
	private String nome; 
	private Date dataDeNascimento; 
	private String nomeUsuario; 
	private String senha;
	
	public Administrador(int id, String nome, Date dataDeNascimento, String nomeUsuario, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
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

	public int getId() {
		return id;
	}
	
	
	
}
