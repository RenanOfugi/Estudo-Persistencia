package nosql;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Manipulacao {

	public void lerArquivo(String caminho) {

		Gson gson = new Gson();

		try {

			JsonReader reader = new JsonReader(new FileReader(caminho));
			User user = gson.fromJson(reader, User.class);
			
			System.out.println("Nome: " + user.getName());
			System.out.println("Genero: " + user.getGender());
			System.out.println("Idade: " + user.getAge());
			System.out.println("Email: " + user.getEmail());
			

		} catch (FileNotFoundException e) {
			e.getLocalizedMessage();
		}

	}
}
