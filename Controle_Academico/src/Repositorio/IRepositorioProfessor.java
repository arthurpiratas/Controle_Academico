package Repositorio;

import Basicas.Aluno;
import Basicas.Professor;;

public interface IRepositorioProfessor {
	
	public void insereProfessor(Professor professor); 
	public void alteraProfessor(Professor professor); 
	public void removeProfessor(int id); 
	public Professor buscaProfessor(int id); 
	public Professor buscaProfessor(String nome); 
	public boolean verificaProfessorExise(String nome); 
	public void listaProfessors(); 
	public Professor[] retornaListaProfessor(); 
	public boolean verifiaProfessorLogin(String login); 
	public Professor buscaProfessorLogin(String login);
}
