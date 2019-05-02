package Repositorio;

import Basicas.Disciplina;

public class RepositorioDisciplinaArray implements IRepositorioDisciplina{
	
	private int index;
	public final static int tamanhoMaxDisciplina = 500; 
	private Disciplina listaDisciplina[]; 
	
	public RepositorioDisciplinaArray() {
		// TODO Auto-generated constructor stub
		 
		this.index = 0; 
		this.listaDisciplina = new Disciplina[tamanhoMaxDisciplina];
		
	}

	@Override
	public void insereDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		
		this.listaDisciplina[index] = disciplina; 
		this.index += 1; 
		
	}

	@Override
	public void alteraDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[index].getcodigo() == disciplina.getcodigo()) {
				listaDisciplina[index] = disciplina; 
			}
		}
		
	}

	@Override
	public void removeDisciplina(int codigo) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[index].getcodigo() == codigo) {
				if(index == 1) {
					listaDisciplina[i] = null; 
					index -= 1; 
				}else {
					listaDisciplina[i] = listaDisciplina[index-1];
					index -= 1;
				}
				 
			}
		}
		
		
	}

	@Override
	public Disciplina buscaDisciplina(int codigo) {
		// TODO Auto-generated method stub
		
		Disciplina disciplina = null; 
		
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[index].getcodigo() == codigo) {
				disciplina =  listaDisciplina[i];
				
			}
		}
		
		return disciplina;
	}

	@Override
	public boolean verificaDisciplinaExise(String nome) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < index; i++) {
			if(listaDisciplina[index].getNome().equals(nome)) {
				return true; 
				
			}
		}
		
		return false;
	}

	@Override
	public void listaDisciplinas() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < index; i++) {
			System.out.println("Codigo: " + listaDisciplina[i].getcodigo() + " Nome: " + listaDisciplina[i].getNome() + " Ementa: " + listaDisciplina[i].getEmenta());
		}
		
	}

	@Override
	public Disciplina[] retornaListaDisciplina() {
		// TODO Auto-generated method stub
		return null;
	}

}