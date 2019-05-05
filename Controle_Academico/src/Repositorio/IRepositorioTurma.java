package Repositorio;

import Basicas.Aluno;
import Basicas.Disciplina;
import Basicas.Professor;
import Basicas.Turma;

public interface IRepositorioTurma {
	
	public void insereTurma(Turma turma); 
	public void alteraTurma(Turma turma); 
	public void removeTurma(String nome); 
	public Turma buscaTurma(String nome); 
	public boolean verificaTurmaExise(String nome); 
	public void listaTurma(); 
	public Turma[] retornaListaTurma(); 
	public Turma[] retornaListaTurmaAluno(Aluno aluno);
	public boolean verificaDesciplinaPossuiTurma(Disciplina disciplina); 
	public boolean verificaProfessorPossuiTurma(Professor professor); 
	public void excluiTurmaPorDisciplina(int codigo); 
	public void excluiTurmaPorProfessor(int idProfessor); 
	

}
