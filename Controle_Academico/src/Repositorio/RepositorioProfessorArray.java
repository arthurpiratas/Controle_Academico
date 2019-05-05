package Repositorio;


import Basicas.Professor;

public class RepositorioProfessorArray implements IRepositorioProfessor{
	
	private int index; 
	private Professor listaProfessor[]; 
	public final static int tamanhoMaxProfessor = 400;
	
	public RepositorioProfessorArray() {
		// TODO Auto-generated constructor stub
		
		this.listaProfessor = new Professor[tamanhoMaxProfessor]; 
		this.index = 0; 
		
	}

	public Professor[] getListaProfessor() {
		return listaProfessor;
	}

	@Override
	public void insereProfessor(Professor professor) {
		// TODO Auto-generated method stub
		this.listaProfessor[index] = professor; 
		this.index += 1; 
		
	}

	@Override
	public void alteraProfessor(Professor professor) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getId() == professor.getId()) {
				listaProfessor[i] = professor; 
			}
		}
		
	}

	@Override
	public void removeProfessor(int id) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getId() == id) {
				if(index == 1) {
					listaProfessor[i] = null; 
					index -= 1; 
				}else {
					listaProfessor[i] = listaProfessor[index-1];
					index -= 1;
				}
				 
			}
		}
		
	}

	@Override
	public Professor buscaProfessor(int id) {
		// TODO Auto-generated method stub
		
		Professor professor = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getId() == id) {
				professor =  listaProfessor[i]; 
			}
		}
		
		return professor;
	}

	@Override
	public Professor buscaProfessor(String nome) {
		// TODO Auto-generated method stub
		Professor professor = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getNome().equals(nome)) {
				professor =  listaProfessor[i]; 
			}
		}
		
		return professor;
	}

	@Override
	public boolean verificaProfessorExise(String nome) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[i].getNome().equals(nome)) {
				return true;  
			}
		}
		
		return false;
	}

	@Override
	public void listaProfessors() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			System.out.println("Nome " + listaProfessor[i].getNome() + " Cargo: " + listaProfessor[i].getCargo() + " ID: " + listaProfessor[i].getId());
		}
		
	}

	@Override
	public Professor[] retornaListaProfessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifiaProfessorLogin(String login) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[index].getNomeUsuario().equals(login)) {
				return true; 
			}
		}
		
		return false;
	}

	@Override
	public Professor buscaProfessorLogin(String login) {
		// TODO Auto-generated method stub
		Professor professor = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaProfessor[index].getNomeUsuario().equals(login)) {
				professor = listaProfessor[i];
			}
		}
		
		return professor;
	}

	

}
