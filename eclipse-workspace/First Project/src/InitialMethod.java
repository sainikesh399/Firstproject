import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InitialMethod {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\saini\\OneDrive\\Desktop\\main");
		f.mkdirs();

		System.out.println("Welcome to my page ");
		System.out.println("The developer of this page is "+ "Nikesh");
		System.out.println("Intial menu: ");
		while(true) {
		System.out.println("1.retrieve the data from the folder");
		System.out.println("2.Display secondary menu for performing file opertaions");
		System.out.println("3.Displayed prgramme terminated successfully.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice_1: ");
		int choice_1 = sc.nextInt();
		switch (choice_1) {
		case 1:
			System.out.println("retreiving data from folder");
			File ob = new File("C:\\Users\\saini\\OneDrive\\Desktop\\main");
			File array[] = ob.listFiles();
			for(int i=0; i< array.length; i++) {
				System.out.println(array[i]);
			}
			break;
		case 2: 
			System.out.println("Display secondary menu for performing file operations.");
			int t=10;
			while(t==10) {
				System.out.println("1.allow user to add a file");
				System.out.println("2.allow user to delete file");
				System.out.println("3.allow user to specify file name starts with");
				System.out.println("4.return to previous menu");
				System.out.println("5.Display and terminated successfuly.");
				System.out.println("Enter your choice_2: ");
				int choice_2 = sc.nextInt();
				switch(choice_2) {
				
				case 1:
				File file = new File("C:\\Users\\saini\\OneDrive\\Desktop\\main");
				//fle.mkdir();

				if(file.exists())
				System.out.println("FILE ALREADY EXISTS");
				else
				{
				file.mkdir();
				System.out.println("FILE CREATED SUCCESSFULLY");
				}

				File file1 = new File("C:\\Users\\saini\\OneDrive\\Desktop\\main\\folder");

				if(file1.exists())
				{
				System.out.println("FILE ALREADY EXISTS");
				}
				else
				{
				try {
				file1.createNewFile();
				} catch (IOException e) {

				e.printStackTrace();
				}
				}

				File file2 = new File("C:\\Users\\saini\\OneDrive\\Desktop\\main\\folder2");

				if(file2.exists())
				{
				System.out.println("FILE ALREADY EXISTS");
				}
				else
				{
				try {
				file2.createNewFile();
				} catch (IOException e) {

				e.printStackTrace();
				}
				}
				break;
				case 2:
				File arr[] = f.listFiles();

				for(int i=0; i<arr.length; i++)
				{
				System.out.println(arr[i]);
				}

				System.out.println("enter file name to delete");

				Scanner input = new Scanner(System.in);

				String name = input.next();
				File file3 = new File("C:\\Users\\saini\\OneDrive\\Desktop\\main"+name);


				if(file3.delete())
				{
				System.out.println("file deleted successfully");

				}
				else
				{
				System.out.println("file not found");
				}
				break;
				case 3:
					String con = sc.next();
					File obj13 = new File("C:\\Users\\saini\\OneDrive\\Desktop\\main");
					File arr1[] = obj13.listFiles();
					int len = arr1.length;
					int count = 0;
					for (int i=0; i<arr1.length; i++)
					{
					if(arr1[i].getName().startsWith(con))
					{

					System.out.println(i+1+")."+arr1[i]);

					}

					else
					{
					count ++;
					}
					if(count == len)
					System.out.println("file not found");

					}
					break;
				case 4:
					t=15;
					System.out.println("Return to previous menu.");
					break;
				case 5:
					System.out.println("Display and terminated Successfully.");
					sc.close();
					System.exit(0);
					default: 
						System.out.println("Enter the correct choice.");
				}
				
				
				
			}
			break;
		case 3:
			System.out.println("Display the program and terminated Successfully");
			sc.close();
			System.exit(0);
			break;
			default: 
				System.out.println("Enter the correct choice.");
			}
		}
		
		
	}

}
