package Repositorio;
import Basicas.Aluno;

public interface IRepositorioAluno {
	
	public void insereAluno(Aluno aluno); 
	public void alteraAluno(Aluno aluno); 
	public void removeAluno(String matricula); 
	public Aluno buscaAluno(String matricula); 
	public boolean verificaAlunoExise(String matricula); 
	public void listaAluno(); 
	public Aluno[] retornaListaAluno(); 
	
}
