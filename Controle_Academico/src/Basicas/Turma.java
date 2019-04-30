package Basicas;

import java.util.Date;

public class Turma {
	
	private int id; 
	private String nome; 
	private Date dataDeNascimento; 
	private Professor professor; 
	private int capacidadeDaTurma;
	
	
	public Turma(int id, String nome, Date dataDeNascimento, Professor professor, int capacidadeDaTurma) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.professor = professor;
		this.capacidadeDaTurma = capacidadeDaTurma;
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
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public int getCapacidadeDaTurma() {
		return capacidadeDaTurma;
	}
	public void setCapacidadeDaTurma(int capacidadeDaTurma) {
		this.capacidadeDaTurma = capacidadeDaTurma;
	} 
	
	
}
