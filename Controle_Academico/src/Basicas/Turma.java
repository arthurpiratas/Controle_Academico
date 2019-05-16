package Basicas;

import java.util.Date;

public class Turma {
	
	private int id; 
	private String nome; 
	private Date dataDeNascimento; 
	private Professor professor; 
	private Disciplina disciplina; 
	private int capacidadeDaTurma;
	private String alunoTurma[]; 
	private int qtdAlunoTurma; 
	
	
	public Turma(int id, String nome, Date dataDeNascimento, Professor professor, int capacidadeDaTurma, Disciplina disciplina) {
		
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.professor = professor;
		this.capacidadeDaTurma = capacidadeDaTurma;
		this.alunoTurma = new String[capacidadeDaTurma]; 
		this.qtdAlunoTurma = 0; 
		this.disciplina = disciplina; 
	}
	
	public Turma(int id, String nome, Date dataDeNascimento, int capacidadeDaTurma, Disciplina disciplina) {
		
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.professor = null; 
		this.capacidadeDaTurma = capacidadeDaTurma;
		this.alunoTurma = new String[capacidadeDaTurma]; 
		this.qtdAlunoTurma = 0; 
		this.disciplina = disciplina; 
	}
	
	
	
	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public String[] getAlunoTurma() {
		return alunoTurma;
	}


	public void setAlunoTurma(String[] alunoTurma) {
		this.alunoTurma = alunoTurma;
	}


	public int getQtdAlunoTurma() {
		return qtdAlunoTurma;
	}


	public void setQtdAlunoTurma(int qtdAlunoTurma) {
		this.qtdAlunoTurma = qtdAlunoTurma;
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
