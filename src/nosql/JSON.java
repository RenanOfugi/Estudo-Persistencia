package nosql;

public class JSON {

	public static void main(String[] args) {
		
		Manipulacao manipulacao = new Manipulacao();
		String localfile = "user.json";
		
		manipulacao.lerArquivo(localfile);
	}

}
