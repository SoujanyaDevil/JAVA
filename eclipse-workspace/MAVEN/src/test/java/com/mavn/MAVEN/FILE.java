package com.mavn.MAVEN;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

public class FILE {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// creating file in our Project-write txt file

		File FILE = new File("FileName.txt");

		if (!FILE.exists()) {
			FILE.createNewFile();
		}
		PrintWriter PW = new PrintWriter(FILE);
		PW.println("This is created File");
		PW.println("Done Successfully");
		PW.append("SOUJANYA");
		PW.checkError();
		PW.close();
		System.out.println("Done Successfully");

		// read the txt file from our proj.

		BufferedReader BR = new BufferedReader(new FileReader("FileName1.txt"));
		String Line;
		while ((Line = BR.readLine()) != (null)) {
			System.out.println(Line);

		}
		BR.close();
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");

		// print Current date tym month year
		Date Dt = new Date(0);
		System.out.println(Dt.toString());
		System.out.println(Dt.getDate());
		System.out.println(Dt.getDay());
		System.out.println(1900 + Dt.getYear());

	}

}
