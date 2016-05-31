package xml;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Turma {

	private ArrayList<Aluno> alunos;
	
	public ArrayList<Aluno> getAluno(){
		return alunos;
	}
	
	public void setAluno(ArrayList<Aluno> aluno){
		this.alunos = aluno;
	}
}
