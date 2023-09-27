package dad.maven.gson;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre");
		String line = scanner.nextLine();
		p.setNombre(line);
		System.out.println("Introduce el apellido");
		line = scanner.nextLine();
		p.setApellidos(line);
		System.out.println("Introduce la edad");
		int num = scanner.nextInt();
		p.setEdad(num);
		scanner.close();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	
		
	}

}
