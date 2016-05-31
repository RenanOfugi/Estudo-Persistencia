package xml;

import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class persistenciaXML {
	
	public static void main(String[] args) throws JAXBException {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Renan Ofugi");
		aluno.setEmail("renan.xxx@gmail.com");
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno);
		
		Turma turma = new Turma();
		turma.setAluno(alunos);
		
		JAXBContext context = JAXBContext.newInstance(Turma.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		m.marshal(turma, System.out);
	}
}
