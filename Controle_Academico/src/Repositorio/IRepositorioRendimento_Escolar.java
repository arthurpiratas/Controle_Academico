package Repositorio;

import Basicas.Aluno;
import Basicas.Turma;
import Basicas.Rendimento_Escolar;;

public interface IRepositorioRendimento_Escolar {
	
	public void insereRendimento(Rendimento_Escolar rendimentoEscolar); 
	public void alteraRendimento(Rendimento_Escolar rendimentoEscolar); 
	public void removeRendimento(Aluno aluno, Turma turma); 
	public Rendimento_Escolar buscaRendimento_Escolar(Aluno aluno, Turma turma); 
	public boolean verificaRendimento_Escolar(Aluno aluno, Turma turma); 
	public void listaRendimento_EscolarAluno(Aluno aluno); 
	public void listaRendimento_EscolarTurma(Turma turma); 
	public Rendimento_Escolar[] retornaListaRendimento_EscolarAluno(Aluno aluno);
	public Rendimento_Escolar[] retornaListaRendimento_EscolarTurma(Aluno turma);

}
