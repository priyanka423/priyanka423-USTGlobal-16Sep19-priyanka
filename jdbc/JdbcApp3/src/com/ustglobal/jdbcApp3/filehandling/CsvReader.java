package com.ustglobal.jdbcApp3.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
public class CsvReader {
	public static void main(String[] args) {
		try(FileReader in=new FileReader("csv.txt");
				BufferedReader reader=new BufferedReader(in)){

			// read line from the file line by line
			while(reader.ready()) {
				String line=reader.readLine();
				String[] words=line.split(",");
				System.out.println(" Id: "+words[0]);
				System.out.println(" Name: "+words[1]);
				System.out.println(" Sal: "+words[2]);
				System.out.println(" Gender: "+words[3]);

				// reade all line at a time//

				//								while(reader.ready()) {
				//							System.out.println(reader.readLine());
				//			}

			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
