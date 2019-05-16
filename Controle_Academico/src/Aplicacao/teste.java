package Aplicacao;

import java.util.Date;

import Basicas.*;
import Negocio.*;
import Repositorio.*;

public class teste {
	public static void main(String[] args) {
		
		/* teste Aluno 
		ControleAluno ctrAluno = new ControleAluno(); 
		Aluno aluno, aluno2, aluno3, aluno4; 
		
		
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
		
		ctrAluno.removeAluno(aluno3.getMatricula());
		ctrAluno.listaAlunos();
		
		
		
		
		if(ctrAluno.verificaLoginAluno(aluno.getNomeUsuario(), aluno.getSenha())) {
			aluno4 = ctrAluno.retornaAlunoLogado(aluno.getNomeUsuario(), aluno.getSenha());
			System.out.println("Aluno: " + aluno4.getNome() + " logado");
		}else {
			System.out.println("Login/ou errado");
		}
		
		*/
		
		/* 
		
		Teste Professor
		
		ControleProfessor ctrProf = new ControleProfessor(); 
		Professor prof, prof2, prof3, prof4; 
		
		prof = new Professor(0, "Arthur", "Professor", null, "arthur123", "4545"); 
		prof2 = new Professor(1, "Luiz", "Professor", null, "arthur127", "45458"); 
		
		ctrProf.insereProfessor(prof);
		
		ctrProf.listaProfessor();
		
		System.out.println("  ");
		
		
		
		if(ctrProf.verificaProfessorExiste(prof.getId())) {
			prof3 = ctrProf.buscaProfessor(0); 
			
			prof3.setNome("Otario");
			
			ctrProf.alteraProfessor(prof3);
		}
		
		
		
		ctrProf.insereProfessor(prof2);
				
		ctrProf.listaProfessor();
		
		System.out.println("  ");
		
		ctrProf.removeProfessor(0);
		
		ctrProf.listaProfessor();
		
		if(ctrProf.verificaLoginProfessor(prof.getNomeUsuario(), prof.getSenha())) {
			prof4 = ctrProf.retornaProfessorLogado(prof.getNomeUsuario(), prof.getSenha());
			System.out.println("Professor: " + prof4.getNome() + " logado");
		}else {
			System.out.println("Login/ou senha inválidos");
		}
		*/
		
		/*
		 
		 Teste Disciplina
		
		ControleDisciplina ctrDisciplina = new ControleDisciplina(); 
		Disciplina disc, disc2, disc3, disc4; 
		
		disc = new Disciplina(0, "Matemática", "Dedo no cu e putaria");
		disc2 = new Disciplina(1, "Português", "Salvar o país"); 
		
		ctrDisciplina.insereDisciplina(disc);
		
		ctrDisciplina.listaDisciplina();
		
		System.out.println("  ");
		
		ctrDisciplina.insereDisciplina(disc2);
		
		ctrDisciplina.listaDisciplina();
		
		System.out.println("  ");
		
		disc3 = ctrDisciplina.buscaDisciplina(0); 
		
		disc3.setNome("Putaria Quântica");
		
		ctrDisciplina.listaDisciplina();
		
		System.out.println("  ");
		
		if(ctrDisciplina.verificaDisciplinaExiste("Putria Quântica")) {
			ctrDisciplina.removeDisciplina(0);
		}else {
			System.out.println("Não existe");
		}
		
		
		
		ctrDisciplina.listaDisciplina();
		*/
		
		/*
		 Teste Administrador 
		
		ControleADM ctrAdm = new ControleADM(); 
		Administrador adm, adm2, adm3, adm4; 
		
		adm = new Administrador(0, "Arthur", null, "arthur1234", "4050"); 
		adm2 = new Administrador(1, "Pedro", null, "pedro1234", "9060"); 
		
		ctrAdm.insereADM(adm);
		
		ctrAdm.listaADM();
		
		System.out.println(" ");
		
		ctrAdm.insereADM(adm2);
		
		ctrAdm.listaADM();
		
		System.out.println(" ");
		
		if(ctrAdm.verificaADMExise("Arthur")) {
			ctrAdm.removeADM(0);
		}else {
			System.out.println("Não existe");
		}
		
		ctrAdm.listaADM();
		
		adm3 = ctrAdm.buscaADM("Pedro");
		adm3.setNome("Caio");
		
		ctrAdm.alteraADM(adm3);
		
		System.out.println(" ");
		
		ctrAdm.listaADM();
		
		
		if(ctrAdm.verificaLoginAdm(adm2.getNomeUsuario(), adm2.getSenha())) {
			adm4 = ctrAdm.buscaADMLogin(adm2.getNomeUsuario(), adm2.getSenha()); 
			System.out.println("Nome: " + adm4.getNomeUsuario());
			
		}else {
			System.out.println("Login/ou senha Inválido");
		}
		
		*/
		
		ControleAluno ctrAluno = new ControleAluno(); 
		ControleDisciplina ctrDisciplina = new ControleDisciplina(); 
		ControleProfessor ctrProfessor = new ControleProfessor(); 
		ControleTurma ctrTurma = new ControleTurma(); 
		
		Turma turma, turma1, turma2; 
		
		
		
	}
}
