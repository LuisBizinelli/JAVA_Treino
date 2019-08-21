package Aula;


import java.io.Serializable;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("alunoBB")
@SessionScoped
public class AlunoBB implements Serializable {
	@Inject
	private Aluno aluno = new Aluno();
	
	private Vector<Aluno> alunos;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Vector<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Vector<Aluno> alunos) {
		this.alunos = alunos;
	}
	@PostConstruct
	public void init () {
		this.alunos = new Vector<Aluno>();
	}
	public String adicionar() {
		alunos.add(aluno);
		
		return "Resposta";
	}
	
}
