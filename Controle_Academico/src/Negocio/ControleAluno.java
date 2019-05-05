package Negocio;

import Repositorio.RepositorioAlunoArray;
import Repositorio.IRepositorioAluno;
import Basicas.Aluno;

public class ControleAluno {
	
	IRepositorioAluno repAluno = new RepositorioAlunoArray();
		
	
	public void insereAluno(Aluno aluno) {
			repAluno.insereAluno(aluno);	
	}
	
	public void atualizaAluno(Aluno aluno) {
			repAluno.insereAluno(aluno);
	}
	
	public Aluno buscaAluno(String matricula) {
		return	repAluno.buscaAluno(matricula); 
	}
	
	public void removeAluno(String matricula) {
			repAluno.removeAluno(matricula);
	}
	
	public boolean verificaAlunoExiste(String matricula) {
		return repAluno.verificaAlunoExise(matricula);
	}
	
	public boolean verificaLoginAluno(String login, String senha) {
		
		if(repAluno.verifiaAlunoLogin(login)) {
			Aluno aluno = repAluno.buscaAlunoLogin(login); 
			if(aluno.getSenha().equals(senha)) {
				return true; 
			}
		}
		
		return false; 
	}
	
	public Aluno retornaAlunoLogado(String login, String senha) {
		Aluno aluno = null; 
		
		if(verificaLoginAluno(login, senha)) {
			aluno = repAluno.buscaAlunoLogin(login);
		}
		
		return aluno; 
	}
	
	public void listaAlunos() {
		repAluno.listaAluno();
	}

}
