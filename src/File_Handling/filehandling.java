package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {
	public static void main(String[] args) throws IOException{
		//create folder
		File folder = new File("C:\\FILEHANDLING");//In this location the folder created with the name FILEHANDLING
		folder.mkdir();
		
		//create file with name student.txt
		File f1 = new File(folder,"Student.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//create another file
		File f2 = new File(folder,"Employee.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Exists or not
		System.out.println(folder.exists()); //there are any files exists in folder ? True if exists
		
		if(folder.exists()) {
			File[] list = folder.listFiles(); //to store so many files we created the array of File type
			for(int i=0;i<list.length;i++) {
				System.out.println(list[i].getName());
			}
		}
		
		//Write data in file
		FileWriter writer = new FileWriter(f1);
		writer.write("Hello Students");
		writer.close();
		
		//write data by buffer writer
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1,true));
		bw.newLine();
		bw.write("Student count: "+40);
		bw.newLine();
		bw.write("Have a Nice Day");
		bw.close();
		
		//Read Data from file
		FileReader reader = new FileReader(f1);
		System.out.println("Reading file using filereader");
		int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

		reader.close();
		System.out.println();
		//Read data by buffer
		BufferedReader br = new BufferedReader(new FileReader(f1));
		System.out.println("Reading file using bufferreader");
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
