package Repositorio;

import Basicas.Aluno;
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

}
