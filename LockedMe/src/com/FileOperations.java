package com;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class FileOperations {
	public static void fileOperationsPrompt() throws IOException {
		int fileOperationChoice;
		Label_entry:
			while(true) {
				System.out.println("Press 1 to Add a file");
				System.out.println("Press 2 to Delete a file");
				System.out.println("Press 3 to Search for a file");
				System.out.println("Press 4 to go back to main menu");
				fileOperationChoice = LockedMe.sc.nextInt();
				String filename;
				File myObj;
				switch(fileOperationChoice) {
				case 1:
					System.out.println("Enter the file name");
					filename = LockedMe.sc.next();
					try {
						myObj = new File(filename);
						if (myObj.createNewFile()) {
							System.out.println("File created: " + myObj.getName());
						} else {
							System.out.println("File already exists.");
						}
					} catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Deleting file");
					System.out.println("Enter the file name");
					filename = LockedMe.sc.next();
					myObj = new File(filename);
					if (myObj.isFile()) {
						if(myObj.delete()) 
							System.out.println(filename+" deleted..... ");
						else
							System.out.println(filename+" not deleted..... ");
					} 
					else {
						System.out.println("Not a normal file: enter correct file name");
					}
					break;
				case 3:
					System.out.println("Searching file");
					System.out.println("Enter the file name");
					filename = LockedMe.sc.next();
					myObj = new File(filename);
					File[] fileList = new File(System.getProperty("user.dir")).listFiles();
					ArrayList<String> foundList = new ArrayList<String>();
					for(File fn: fileList) {
						if(fn.getName().equalsIgnoreCase(filename))
							foundList.add(fn.getName());
					}
					if(foundList.size()==0) {
						System.out.println("Nothing found");
					}
					else {
						System.out.println("List of found files below:");
						for(String f: foundList) {
							System.out.println(f);
						}
					}
					break;
				case 4:
					System.out.println("Going out of sub menu file");
					break Label_entry;
				default:
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					break;
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
