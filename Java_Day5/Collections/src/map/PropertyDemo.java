package map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("src/User.properties");

			Properties prop = new Properties();

			prop.load(fr);

			String username = prop.getProperty("username");
			String pwd = prop.getProperty("password");
			
			String city =  prop.getProperty("city.name");
			
			
			System.out.println(username + "  "+ pwd +" "+city);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
