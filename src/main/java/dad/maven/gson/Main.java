package dad.maven.gson;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		Persona p = new Persona();
		
		p.nombre = in.nextLine();
		p.apellidos = in.nextLine();
		p.edad = in.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}

}
