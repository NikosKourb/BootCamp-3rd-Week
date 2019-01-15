package cb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	public static void main(String[] args) {
		
		String answer="";
		
		
		//Create an Empty ArrayList
		ArrayList<Student> stdArrayList=new ArrayList<Student>();
		
		
		Scanner sc=new Scanner(System.in);
		
		
		//User Choice to load Default File or File from a certain location
		System.out.print("Please insert the path of the Student file you want"+"\n"+"to load, or "
				+" type 'd' to load the 'Lab3_Names.txt' from outside the bin folder : ");
		String filePath=sc.next();
		
		if(filePath.equalsIgnoreCase("d")) {
			filePath="././Lab3_Names.txt";
		}
		
		
		//Reads the text file and populates the ArrayList with Student Objects
		try {
	
			FileReader fr1=new FileReader(filePath);
			BufferedReader br1=new BufferedReader(fr1);
			
			for(int i=0;i<1;i++) {//<-----doing this in order to start reading 
		        br1.readLine();        //from the second line of the text file
		        }                      //can be adjusted to start reading 
			                           //from any line by changing the "1" to any integer
			
			String newLine=null;
			
			while((newLine=br1.readLine())!=null) {
				System.out.println(newLine);//<-----You can enable/disable it to show/hide every line
				String[] data=newLine.split(",");      // of the text file as BufferedReader reads it
				String fName=data[0];
				String sName=data[1];
				int age=Integer.parseInt(data[2]);
				String heightString=data[3];
				double height=Double.parseDouble(data[3]);
				int tuition=Integer.parseInt(data[4]);
				String dateString=data[5];
				SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
				Date date=format1.parse(dateString);
				long phone=Long.parseLong(data[6]);
				String conduct="Good";
				stdArrayList.add(new Student(fName,sName,age,height,heightString,tuition,date,dateString,phone,conduct));
				
				}
			br1.close();
			}
		catch(Exception e){
			}
		
		
		do {
			String str1="0. By Default"+"\n"+"1. By First Name"+"\n"+"2. By Last Name"+"\n"+"3. By Age"+"\n"
		                +"4. By Height"+"\n"+"5. By Tuition"+"\n"+"6. By Date"+"\n"+"7. By Phone"+"\n"
					    +"8. By Conduct"+"\n"+"9. Change Student's Conduct";
			
			String str2="First Name---Last Name---Age---Height---Tuition---Date---Phone---Conduct";
			
			System.out.println("\n"+"How do you want to sort the list:"+"\n"+str1);
			System.out.println("Type in a number from the above:");
			String usrChoice=sc.next();
			
			while(!usrChoice.equals("0")&&!usrChoice.equals("1")&&!usrChoice.equals("2")&&!usrChoice.equals("3")&&!usrChoice.equals("4")
				  &&!usrChoice.equals("5")&&!usrChoice.equals("6")&&!usrChoice.equals("7")&&!usrChoice.equals("8")&&!usrChoice.equals("9")) {
				System.out.println("Invalid input"+"\n"+"Please type in one of the given choices"+"\n"+str1+"\n"+"TYPE:");
				usrChoice=sc.next();
				}
			
			
			//0.Sort by DEFAULT
			if(usrChoice.equals("0")) {
				System.out.println("\n"+"Sorted by Default:"+"\n"+str2);
				for(Student std: stdArrayList){
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//1.Sort by FIRST NAME
			if(usrChoice.equals("1")) {
				System.out.println("\n"+"Sorted by First Name:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.fNameComp);
				for(Student std: stdArrayList){
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//2.Sort by LAST NAME
			if(usrChoice.equals("2")) {
				System.out.println("\n"+"Sorted by Last Name:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.lNameComp);
				for (Student std : stdArrayList) {
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//3.Sort by AGE
			if(usrChoice.equals("3")) {
				System.out.println("\n"+"Sorted by Age:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.ageComp);
				for (Student std : stdArrayList) {
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//4.Sort by HEIGHT
			if(usrChoice.equals("4")) {
				System.out.println("\n"+"Sorted by Height:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.heightComp);
				for (Student std : stdArrayList) {
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//5.Sort by TUITION
			if(usrChoice.equals("5")) {
				System.out.println("\n"+"Sorted by Tuition:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.tuitionComp);
				for (Student std : stdArrayList) {
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//6.Sort by DATE
			if(usrChoice.equals("6")) {
				System.out.println("\n"+"Sorted by Date:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.dateComp);
				for (Student std : stdArrayList) {
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//7.Sort by PHONE
			if(usrChoice.equals("7")) {
				System.out.println("\n"+"Sorted by Phone:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.phoneComp);
				for (Student std : stdArrayList) {
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//8.Sort by CONDUCT
			if(usrChoice.equals("8")) {
				System.out.println("\n"+"Sorted by Conduct:"+"\n"+str2);
				Collections.sort(stdArrayList, Student.conductComp);
				for (Student std : stdArrayList) {
					System.out.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				System.out.println("\n");
				}
			
			
			//9.Change Student's Conduct
			if(usrChoice.equals("9")) {
				boolean bool1=true;
				System.out.println("Give me the Student's Surname: ");
				String stdSurname=sc.next();
				for(Student stdA:stdArrayList) {
					if(stdA.getLName().equals(stdSurname)) {
						bool1=true;
						System.out.println("Give me the new conduct for the Student: ");
						String stdConduct=sc.next();
						stdA.setConduct(stdConduct);
						break;
					}
					else {
						bool1=false;
					}
				}
				if(bool1==false) {
					System.out.println("Student not found");
				}
				else {
					System.out.println("New Conduct saved");
				}
				
			}
			
			
			//User Choice to Save his/her Sorted List or not
			System.out.println("Do you want to Save the Sorted List in a text file(y/n): ");
			String printChoice=sc.next();
			
			while(!printChoice.equalsIgnoreCase("y")&&!printChoice.equalsIgnoreCase("n")) {
				System.out.print("Invalid input"+"\n"+"Do you want to Save the Sorted List in a text file(y/n): ");
				printChoice=sc.next();
				}
			
			if(printChoice.equalsIgnoreCase("y")) {
				//User Choice for the text File's Name
				System.out.print("Give me a name for the text file(No_Spaces): ");
				String newFileName=sc.next();
				
				//PrintWriter that Saves the sorted ArrayList in a text File
				PrintWriter pw;
			
			try {
				pw=new PrintWriter(newFileName+".txt","UTF-8");
				
				
				pw.println(str2);
				for (Student std : stdArrayList) {
					pw.println("[ "+std.getFName()+"---"+std.getLName()+"---"+std.getAge()+"---"+std.getHeight()
					+"---"+std.getTuition()+"---"+std.getDateString()+"---"+std.getPhone()+"---"+std.getConduct()+" ]");
					}
				pw.close();
				System.out.println("\n"+newFileName+".txt was saved");
				}
				
					
			catch (Exception ex) {
				Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,ex);
				}
			}
			
			System.out.print("\n");
			
			//User Choice to Continue or not
			System.out.print("Do you want to Continue Sorting the List in another way(y/n): ");
			answer=sc.next();
			
			while(!answer.equalsIgnoreCase("y")&&!answer.equalsIgnoreCase("n")) {
				System.out.print("Invalid input"+"\n"+"Do you want to Continue Sorting the List in another way(y/n): ");
				answer=sc.next();
			}
			
			}while(answer.equalsIgnoreCase("y"));
		
		sc.close();
	}
	
	
}