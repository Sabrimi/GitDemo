package seleniumManual;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlovalValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/Sabrusutra/eclipse-workspace/seleniumManual/src/data.proterties");
		prop.load(fis);
		System.out.print(prop.getProperty("browser"));

		System.out.print(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");

		System.out.print(prop.getProperty("browser"));

		FileOutputStream foos = new FileOutputStream(
				"/Users/Sabrusutra/eclipse-workspace/seleniumManual/src/data.proterties");
		prop.store(foos, null);
	}

}
