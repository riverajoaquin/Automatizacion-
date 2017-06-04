package testOnline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) throws IOException {

		String web = "http://10.10.0.74:86/";
		String a = "Se cargo correctamente la apk";
	    String b= "Cargo elemento";   
		try {

			System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.11.1-win64/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(web);
			
			if (web != null) {
				// Crear un objeto File se encarga de crear o abrir acceso a un
				// archivo
				File archivo = new File("texto.txt");

				// Crear objeto FileWriter que escribira sobre archivo
				FileWriter escribir = new FileWriter(archivo, true);

				// Escribe el archivo con el metodo write
				escribir.write(a);
				escribir.write(b);

				// Cierro la conexion
				escribir.close();
				
				//boton de login 
				WebElement element2 = driver.findElement(By.className("btn"));				
				element2.click();		
			
			}
			
			driver.close();

		}

		// Si existe un problema al escribir viene pa aca
		catch (Exception e) {
			File archivo1 = new File("textofallo.txt");

			FileWriter escribir1 = new FileWriter(archivo1, true);

			escribir1.write(e.getMessage());

			escribir1.close();
		}
	}
}