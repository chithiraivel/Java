package entranceExam;

import java.util.Scanner;

public class Login {
	
	public void userLogin() {
		
		Scanner sc=new Scanner(System.in);
		
		byte i=1;
		while(i<2) {
		System.out.println("Enter MailId");
		 String mailId=sc.next();
		 System.out.println("Password");
		 String name=sc.next();
		 
		 StudentsLogin data=StudentsLogin.map.get(mailId);
		 
		 if(i==1) {
		 if(data.mailId!=null && data.name.equals(name)) {
			System.out.println("Login Successfully");
			this.studentInfo();
			 i++;
		 }
		 else {
			 System.out.println("try again!!!");
			 i++;
		 }
		
				
		 }
		}
		}

	private void studentInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		
		if(age>=18 && age<=28) {
			
			System.out.println("your are allowed");
		}
		
	}
}
