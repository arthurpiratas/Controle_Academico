package Aplicacao;

import java.util.Date;

import Basicas.*;
import Negocio.*;
import Repositorio.*;

public class teste {
	public static void main(String[] args) {

		ControleAluno ctrAluno = new ControleAluno(); 
		Aluno aluno, aluno2, aluno3, aluno4; 
		Date dataDate; 
		
		aluno = new Aluno(12346, "Arthur", null, 2, "arthur1", "1234", "123456");
		aluno3 = new Aluno(1235, "jez", null, 1, "jez", "147", "132789"); 
		
		ctrAluno.insereAluno(aluno);
		ctrAluno.insereAluno(aluno3);
		
		ctrAluno.listaAlunos();
		
		if(ctrAluno.verificaAlunoExiste(aluno.getMatricula())) {
			aluno2 = ctrAluno.buscaAluno(aluno.getMatricula()); 
			
			aluno2.setNome("Arthur Lindo");
			
			ctrAluno.atualizaAluno(aluno2);
		}
		
		System.out.println("   ");
		
		ctrAluno.listaAlunos();
		
		System.out.println("   ");
		
		ctrAluno.removeAluno(aluno.getMatricula());
		ctrAluno.listaAlunos();
		
		
		if(ctrAluno.verificaLoginAluno(aluno.getNomeUsuario(), aluno.getSenha())) {
			aluno4 = ctrAluno.retornaAlunoLogado(aluno.getNomeUsuario(), aluno.getSenha());
			System.out.println("Aluno: " + aluno4.getNome() + " logado");
		}else {
			System.out.println("Login/ou errado");
		}
		
	}
}
