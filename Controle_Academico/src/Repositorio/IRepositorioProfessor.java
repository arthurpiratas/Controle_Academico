package Repositorio;

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
}
