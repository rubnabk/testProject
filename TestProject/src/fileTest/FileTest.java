package fileTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

	public static void main(String[] args) {

		String basePath = new File("").getAbsolutePath();
		Double ans = null;
		byte[] fileArray;
		Path filePath = Paths.get(basePath, "ans.txt");
		System.out.println(filePath);
		
		try {
			fileArray = Files.readAllBytes(filePath);
//			ans = Double.parseDouble(new String(fileArray));
		} catch (NumberFormatException e) {
			System.err.println("El último valor almacenado no es un número válido.");
		} catch (NoSuchFileException e){
			System.err.println("El fichero " + filePath.getFileName() + " no existe.");
		} catch (IOException e) {
			System.err.println("Error leyendo del fichero " + filePath);
			e.printStackTrace();
		}
		
		System.out.println("Double " + ans.toString());
		
		System.out.println(ans);
		
		
	}

}

