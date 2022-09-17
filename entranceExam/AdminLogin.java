package entranceExam;

import java.util.Scanner;

public class AdminLogin {
	


public void adminLogin() {
		
		Scanner sc=new Scanner(System.in);
		
		byte i=1;
		while(i<2) {
		System.out.println("Enter MailId");
		 Long userId=sc.nextLong();
		 System.out.println("Password");
		 String name=sc.next();
		 
		 AdminUser data=AdminUser.admin.get(userId);
		 
		 if(i==1) {
		 if(data.userId!=null && data.name.equals(name)) {
			System.out.println("Login Successfully");
			this.adminUser();
			 i++;
		 }
		 else {
			 System.out.println("try again!!!");
			 i++;
		 }	
		 }
		}
	}

private void adminUser() {
	
	Scanner sc=new Scanner(System.in);
	byte i=1;
	byte mark=92;
	while(i<5) {
	 if(i==1) {
		 System.out.println("Question No 1");
		 mark++;
		
		 i++;
	 }
	 else if(i==2) {
		 System.out.println("Question No 2");
		 mark++;
		 i++;
	 }
	 else if(i==3) {
		 System.out.println("Question No 3");
		 mark++;
		 i++;
	 }
	 else if(i==4) {
		 System.out.println("Question No 4");
		 mark++;
		 i++;
	 }
	 
	 
	 
}i++;
System.out.println("Your mark is :"+mark);

  if(mark>100) {
	  System.out.println("Qualified");
  }
  else if(mark<0) {
	  
	  System.out.println("wrongly answered");
  }


	 System.out.println("Interview  press 1.Activate/2.Deactivate");
	 
	 byte choice =sc.nextByte();
 switch(choice) {
       
 case 1:{
	 System.out.println("Activate");
	 break;
 }
 
 case 2:{
	 System.out.println("Deactivated");
	 break;
 }
 }
 

 
 
}
}
