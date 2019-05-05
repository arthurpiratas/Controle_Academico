package Negocio;

import Basicas.Aluno;
import Basicas.Disciplina;
import Basicas.Professor;
import Basicas.Turma;
import Repositorio.IRepositorioTurma;
import Repositorio.RepositorioTurmaArray;

public class ControleTurma {
	
	IRepositorioTurma repTurma = new RepositorioTurmaArray(); 
	
	public void insereTurma(Turma turma) {
		repTurma.insereTurma(turma);
	}
	public void alteraTurma(Turma turma) {
		repTurma.insereTurma(turma);
	}
	public void removeTurma(String nome) {
		repTurma.removeTurma(nome);
	}
	public Turma buscaTurma(String nome) {
		return repTurma.buscaTurma(nome); 
	}
	public boolean verificaTurmaExiste(String nome) {
		return repTurma.verificaTurmaExise(nome);  
	}
	public void listaTurma() {
		repTurma.listaTurma();
	}
	public boolean verificaDesciplinaPossuiTurma(Disciplina disciplina) {
		return repTurma.verificaDesciplinaPossuiTurma(disciplina);
	}
	public boolean verificaProfessorPossuiTurma(Professor professor) {
		return repTurma.verificaProfessorPossuiTurma(professor); 
	}
	public void excluiTurmaPorDisciplina(int codigo) {
		repTurma.excluiTurmaPorDisciplina(codigo);
	}
	public void excluiTurmaPorProfessor(int idProfessor) {
		repTurma.excluiTurmaPorProfessor(idProfessor);
	}
	public boolean verificaAlunoEmTurma(Turma turma, Aluno aluno) {
		
		for (int i = 0; i < turma.getQtdAlunoTurma(); i++) {
			if(turma.getAlunoTurma()[i].equals(aluno.getMatricula())) {
				return true; 
			}
		}
		
		return false; 
	}
	public void insereAlunoEmTurma(Turma turma, Aluno aluno) {
		
		String alunos[] = turma.getAlunoTurma(); 
		
		alunos[turma.getCapacidadeDaTurma()] = aluno.getMatricula();
		turma.setCapacidadeDaTurma(turma.getCapacidadeDaTurma()+1);
		
		turma.setAlunoTurma(alunos);
	}
	public void removeAlunoEmTurma(Turma turma, Aluno aluno) {
		
		String alunos[] = turma.getAlunoTurma(); 
		
		for (int i = 0; i < turma.getCapacidadeDaTurma(); i++) {
			if(alunos[i].equals(aluno.getMatricula())) {
				alunos[turma.getCapacidadeDaTurma()] = alunos[turma.getCapacidadeDaTurma()-1];
				turma.setCapacidadeDaTurma(turma.getCapacidadeDaTurma()-1);
			}
		}
		
		turma.setAlunoTurma(alunos);
	}
	
}
