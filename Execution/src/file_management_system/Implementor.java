package file_management_system;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Implementor {
			

			public static void main(String[] args) throws Exception{
				Business_logic BL = new Business_logic();
				System.out.println("               ░W░E░L░C░O░M░E░                                      ");

				while (true) {	
				Scanner sc = new Scanner(System.in);
				System.out.println("\n>>> (っ◔◡◔)っ  Please enter your Username : \n");
				
				String i = sc.nextLine();
			

				if(i.equalsIgnoreCase("omkar")) {
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Calendar cal = Calendar.getInstance();
					System.out.println("You logged in at "+dateFormat.format(cal.getTime()));
					while(true) {
					System.out.println("\nᴡʜᴀᴛ ᴡᴏᴜʟᴅ ʏᴏᴜ ʟɪᴋᴇ ᴛᴏ ᴅᴏ?\n"
							+ "\n【﻿１．】 --  【﻿ Ｖｉｅｗ　ｔｈｅ　ｃｏｎｔｅｎｔｓ　ｐｒｅｓｅｎｔ　ｉｎ　ｔｈｅ　ｃｕｒｒｅｎｔ　ｄｉｒｅｃｔｏｒｙ  】\n"
							+ "【﻿2．】 --  【 Explore other option 】\n"
							+ "【﻿3．】 --  【 ﻿Ｅｘｉｔ 】");
					int input = 0;
					try {
					 input = Integer.parseInt(sc.nextLine());
					}catch (NumberFormatException e){
						
					}
					
					if(input == 1) {
						BL.viewcontentindir();
					
					}
					
					else if(input == 2 ) {
						
						BL.otheroptionslogic();
					}
					
					else if(input == 3) {
						System.out.println("==================================================");
						System.out.println("Thank you for using our application :");
						System.out.println("==================================================");
						break;
					}
					
					else {
						System.out.println("Please give a valid input");
					}
					
				}
				
		}
				else {
					System.out.println("you are not a valid user :");
				}
			
		    }
		  }
	
	}
