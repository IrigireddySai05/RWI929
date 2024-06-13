package day9;

import java.io.*;
import java.util.*;

public class File_Handling {

	public static void main(String[] args) {
//create file
		try {
			File f1=new File("E:/Railworld/Practice/src/day9/exp.txt");
			if(f1.createNewFile()) System.out.println("File " + f1.getName() + " created");
			else System.out.println("Already exist");
		}
		
		catch (IOException e) {
			System.out.println(e);
			}
			
// file info
			File f0=new File("E:/Railworld/Practice/src/day9/exp.txt");
			if(f0.exists()) {
				System.out.println(f0.getName()+ " Exist");
			
				System.out.println(f0.getAbsolutePath());
				
				System.out.println("Writable?? " + f0.canWrite());
				
				System.out.println("Readable?? " + f0.canRead());
				
				System.out.println("Size- " + f0.length());
				
				System.out.println(f0.getFreeSpace());
				System.out.println(f0.getTotalSpace());
				System.out.println(f0.lastModified());
				System.out.println(f0);
				System.out.println(f0.exists());
				System.out.println(f0.list());
				System.out.println(f0.mkdir());

			}

			
// edit 			
			try(InputStreamReader isR=new InputStreamReader(System.in)) {
				System.out.println("Enter Letters:");
				int letters= isR.read();
				while(isR.ready()) {
					System.out.print((char)letters);
					letters=isR.read();
				}
				isR.close();
				System.out.println();
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			

			
			
			
			
// write to file			
			try {
				FileWriter fw=new FileWriter("E:/Railworld/Practice/src/day9/exp.txt");
				fw.write("Yo my name is Shruti");
				fw.close();
			}
			catch(IOException e) {
				
				e.printStackTrace();
			}
			
	
// read 
			try(FileReader is=new FileReader("E:/Railworld/Practice/src/day9/exp.txt")){
				int l;
				while((l=is.read())!=-1) {
					System.out.print((char) l);
				}
				is.close();
			}
				catch(IOException e) {
					e.printStackTrace();
				}
				
				
// read a file
			try {
				FileReader fr= new FileReader("E:/Railworld/Practice/src/day9/exp.txt");
				Scanner Data= new Scanner(fr);	
				while(Data.hasNextLine()) {
					String LData=Data.nextLine();
					System.out.println(LData);
				}
				fr.close();
			} 	
			catch(IOException e) {
				e.printStackTrace();
			}
			
			
// delete a file
			File fd= new File("E:/Railworld/Practice/src/day9/exp.txt");
			if(fd.delete()) System.out.println("deleted");
			else System.out.println("Not Deleted");

		}
	}


