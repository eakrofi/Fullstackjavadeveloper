package com;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe {
	static Scanner sc = new Scanner(System.in);

	public static void display() {
		System.out.println("press 1 to print all files in current directory in ascending order");
		System.out.println("press 2 for file operations");
		System.out.println("press 3 to logout");
	}

	public static void main(String[] args) {
		System.out.println("Akrofi Soft");
		System.out.println("You are Welcome to Akrofi Soft");
		// @SuppressWarnings("resource")
		//Scanner sc = new Scanner(System.in)
		File[] fileList;
		Label_main_menu:
		while(true) {
			display();
			System.out.println("Enter a number 1 - 3");
			try { 
				int choice = sc.nextInt();
				switch(choice) {
				
				case 1:
					fileList = new File(System.getProperty("user.dir")).listFiles();
					Arrays.sort(fileList);
					for(File f:fileList) {
						System.out.println(f.getName());
			        }
					break;
				
				case 2:
					FileOperations.fileOperationsPrompt();
					break;
					
				case 3: 
					break Label_main_menu;
				
				default:
						System.out.println("Please choice between 1 to 3");
			}
			}catch (Exception e) {
				System.out.println("Please make sure to choose a number 1 to 3");
				sc.next();
			}
		}
		}
}
