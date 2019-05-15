package Repositorio;

import Basicas.Aluno;
import Basicas.Disciplina;
import Basicas.Professor;
import Basicas.Turma;

public class RepositorioTurmaArray implements IRepositorioTurma{
	
	
	private Turma listaTurma[]; 
	private int index; 
	public final static int tamanhoMaxTruma = 1000;
	
	public RepositorioTurmaArray() {
		this.listaTurma = new Turma[tamanhoMaxTruma]; 
		this.index = 0; 
	}
	
	@Override
	public void insereTurma(Turma turma) {
		// TODO Auto-generated method stub
		
		listaTurma[index] = turma; 
		this.index += 1; 
		
	}

	@Override
	public void alteraTurma(Turma turma) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getId() == turma.getId()) {
				listaTurma[i] = turma; 
			}
		}
		
	}

	@Override
	public void removeTurma(String nome) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getNome().equals(nome)) {
				if(index == 1) {
					listaTurma[i] = null; 
					index -= 1; 
				}else {
					listaTurma[i] = listaTurma[index-1]; 
					index -= 1; 
				}
			}
		}
	}

	@Override
	public Turma buscaTurma(String nome) {
		// TODO Auto-generated method stub
		
		Turma turma = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getNome().equals(nome)) {
				turma = listaTurma[i]; 
			}
		}
		
		return turma;
	}

	@Override
	public boolean verificaTurmaExise(String nome) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[index].getNome().equals(nome)) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public void listaTurma() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			System.out.println("Nome: " + listaTurma[i].getNome() + " Quantidade: " + listaTurma[i].getQtdAlunoTurma());
			for (int j = 0; j < listaTurma[i].getQtdAlunoTurma(); j++) {
				System.out.println("Nome: " + listaTurma[i].getAlunoTurma()[i]);
			}
		}
		
		
		
	}

	@Override
	public Turma[] retornaListaTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Turma[] retornaListaTurmaAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
		Turma listaTurmaAluno[] = new Turma[100]; 
		
		for (int i = 0; i < listaTurmaAluno.length; i++) {
			listaTurmaAluno[i] = null; 
		}
		
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < listaTurma[i].getQtdAlunoTurma(); j++) {
				listaTurmaAluno[j] = listaTurma[i];
			}
		}
		
		return listaTurmaAluno;
	}
	
	// Verificação se uma turma possui professores ou disciplina em caso de exclusão de um professor ou disciplina que estão em uma turma

	@Override
	public boolean verificaDesciplinaPossuiTurma(Disciplina disciplina) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getDisciplina().getcodigo() == disciplina.getcodigo()) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public boolean verificaProfessorPossuiTurma(Professor professor) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getProfessor().getId() == professor.getId()) {
				return true; 
			}
		}
		
		return false;
		
	}

	@Override
	public void excluiTurmaPorDisciplina(int codigo) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getDisciplina().getcodigo() == codigo) {
				removeTurma(listaTurma[i].getNome());
			}
		}
		
	}

	@Override
	public void excluiTurmaPorProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaTurma[i].getDisciplina().getcodigo() == idProfessor) {
				removeTurma(listaTurma[i].getNome());
			}
		}
	}

}
