package Repositorio;

import Basicas.Disciplina;

public interface IRepositorioDisciplina {
	
	public void insereDisciplina(Disciplina disciplina); 
	public void alteraDisciplina(Disciplina disciplina); 
	public void removeDisciplina(int codigo); 
	public Disciplina buscaDisciplina(int codigo); 
	public boolean verificaDisciplinaExise(String nome); 
	public void listaDisciplinas(); 
	public Disciplina[] retornaListaDisciplina(); 
	
}
