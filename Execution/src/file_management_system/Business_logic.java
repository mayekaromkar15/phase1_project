package file_management_system;

import java.io.File;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Business_logic {
	Scanner sc = new Scanner(System.in);
	
	public void viewcontentindir() {
		File f = new File("D:\\Simplilearn\\Project\\Root");
		System.out.println("-------------------------------------------------");
		int count = 0;
		String[] s = f.list();
		for(String s1:s) {
			if(s1.endsWith(".txt")) {
				System.out.println("Text Document : "+s1);
			}
			else {
				System.out.println("File  folder  : "+s1);
			}
			
			count++;
		}
		System.out.println("==================================================");
		System.out.println("The total number of files present are : "+count);
		System.out.println("==================================================");;
		
	}
	
	
	public void otheroptionslogic() throws Exception{

		
		System.out.println("\nᴡʜᴀᴛ ᴡᴏᴜʟᴅ ʏᴏᴜ ʟɪᴋᴇ ᴛᴏ ᴅᴏ?\n"
				+ "\n【﻿１．】 --  【﻿ Ａｄｄ　a new folder 】\n"
				+ "【﻿2．】 --  【 Ｄｅｌｅｔｅ　ｅｘｉｓｔｉｎｇ　ｄｉｒｅｃｔｏｒｙ 】\n"
				+ "【﻿3．】 --  【 ﻿Search for an existing file/directory 】\n"
				+ "【﻿4．】 --  【 ﻿Sort the file/folders 】\n");
		int input1 = 0;
		try {
		 input1 = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e){
			
		}
		
			if(input1 == 1) {
			System.out.println("==================================================");
			System.out.println("Enter the name of the folder you would like to add");
			System.out.println("==================================================");
			String a = sc.nextLine();
			File f = new File("D:\\Simplilearn\\Project\\Root", a);
			if(a.endsWith(".txt")) {
				System.out.println("This is not a valid name of the folder");
			}
			else if (f.exists()){
				System.out.println("The folder you are trying to create already exists. ");
				
			}
			else {
				f.mkdir();
				System.out.println("Your folder has been successfully created.");
			}
			
		}
		
			else if(input1 == 2) { 
			System.out.println("==================================================");
			System.out.println("Which file do you want to delete ?");
			System.out.println("==================================================");
			String a = sc.nextLine();
			File f = new File("D:\\Simplilearn\\Project\\Root",a);
			if(f.exists()) {
				f.delete();
				System.out.println("The file/folder is successfully deleted : ");
			}
			else {
				System.out.println("The file/folder you are searching for does not exists :");
			}
			}
			
		
					else if(input1 == 3) {
			
						File f = new File("D:\\Simplilearn\\Project\\Root");
						String[] s = f.list();
						System.out.println("==================================================");
						System.out.println("Please enter the file you would like to search :");
						System.out.println("==================================================");
						String j = sc.nextLine().toLowerCase(); 	
						
						boolean b  = false;
						for (int i1 = 0; i1 < s.length;i1++) {
							if (j.equals(s[i1].toLowerCase())) {
								System.out.println(j+ " found at "+ (i1+1));
								b = true;
								break;				
						}
						}
							if(!b) {
								System.out.println("=======================================================");
								System.out.println(j+" The file you are searching for does not exists ;");
								System.out.println("=======================================================");
							}
			
		
	}	

					else if(input1 == 4) {
						File f = new File("D:\\Simplilearn\\Project\\Root");
						String[] s = f.list();
						System.out.println("==================================================");
						System.out.println("How would you like to sort the files/folders\n"
						         +"【﻿1．】 --  【 ﻿Ascending 】\n"
								+ "【﻿2．】 --  【 ﻿Descending 】");
						System.out.println("==================================================");
						int sort_var = 0;
						try {
							sort_var = Integer.parseInt(sc.nextLine());
						}catch (NumberFormatException e){
							
						}
						if(sort_var == 1) {
							System.out.println("\nThe files have sorted in ascending order");
							System.out.println("----------------------------------------------");
							List<String> li = Arrays.asList(s);
							List<String> ascendingsorted = (List) li.stream().sorted().collect(Collectors.toList());
							ascendingsorted.forEach(System.out::println);
							System.out.println("----------------------------------------------");
							}
						
						if(sort_var == 2) {
							List<String> li = Arrays.asList(s);
							System.out.println("\nThe files have sorted in descending order");
							System.out.println("----------------------------------------------");
							List<String> descendingsorted = (List) li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); 
							descendingsorted.forEach(System.out::println);
							System.out.println("----------------------------------------------");
//							
							}
										
			}
			
					
		
		else {
			System.out.println("\nplease give a valid input :\n");
		}		
		
	}
	

}
	