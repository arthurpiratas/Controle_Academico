package Repositorio;

import Basicas.Aluno;

public class RepositorioAlunoArray implements IRepositorioAluno{
	
	private Aluno listaAluno[]; 
	private int index; 
	public final static int tamanhoMaxAlunos = 1000; 
	
	public RepositorioAlunoArray() {
		this.listaAluno = new Aluno[tamanhoMaxAlunos]; 
		this.index = 0; 
	}
	
	

	public Aluno[] getListaAluno() {
		return listaAluno;
	}



	@Override
	public void insereAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		this.listaAluno[index] =  aluno; 
		this.index += 1; 
		
	}

	@Override
	public void alteraAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaAluno[index].getId() == aluno.getId()) {
				listaAluno[index] = aluno; 
			}
		}
		
	}

	@Override
	public void removeAluno(String matricula) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[index].getMatricula().equals(matricula)) {
				if(index == 1) {
					listaAluno[i] = null; 
					index -= 1; 
				}else {
					listaAluno[i] = listaAluno[index-1]; 
					index -= 1; 
				}
			}
		}
		
	}

	@Override
	public Aluno buscaAluno(String matricula) {
		// TODO Auto-generated method stub
		
		Aluno aluno = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[index].getMatricula().equals(matricula)) {
				aluno = listaAluno[i]; 
			}
		}
		
		return aluno;
	}

	@Override
	public boolean verificaAlunoExise(String matricula) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < index; i++) {
			if(listaAluno[index].getMatricula().equals(matricula)) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public void listaAluno() {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			System.out.println("Nom: " + listaAluno[i].getNome() + " Matrícula: " + listaAluno[i].getMatricula());
		}
	}

	@Override
	public Aluno[] retornaListaAluno() {
		// TODO Auto-generated method stub
		return null;
	}

}
