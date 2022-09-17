package entranceExam;

import java.util.Scanner;

public class MedicalCollege {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("1.Admin Details");
		System.out.println("2.Admin Login");
		System.out.println("3.Students Detail");
		System.out.println("4.Students Login");
		
		byte choice=sc.nextByte();
		
	    switch(choice){
			
	       case 1:{
	    	   System.out.println("ADMIN details");
	    	   new AdminUser().adminUser();
	    	   break;
	       }
	       
	       case 2:{
	    	   System.out.println("Admin Login");
	    	   new AdminLogin().adminLogin();
	    	   break;
	       }
	       
	       case 3:{
	    	   System.out.println("STUDENTS Details");
	    	   new StudentsLogin().studentslogin();
	    	   break;
	       }
	       
	       case 4:{
	    	   System.out.println("Students Login");
	    	   new Login().userLogin();
	    	   break;
	       }
	       
		}
		
		
		}
	}

}
