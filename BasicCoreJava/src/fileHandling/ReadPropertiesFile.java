package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException  {
		
		//Step 1 - Filepath
		String filepath="D:\\Techbodhi\\28102020\\BasicCoreJava\\src\\fileHandling\\Users.properties";
		
		//Step 2
		FileInputStream file= new FileInputStream(filepath);
		
		Properties or= new Properties();
		
		or.load(file);
		
		System.out.println(or.get("surname"));
	}

}
