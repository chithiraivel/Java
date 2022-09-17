package entranceExam;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentsLogin {
	
	String name;
	String phoneNo;
	String mailId;
	String password;
	
	Scanner sc=new Scanner(System.in);
	
	static LinkedHashMap<String,StudentsLogin> map=new LinkedHashMap<String,StudentsLogin>();
	 
	public StudentsLogin(String name,String phoneNo, String mailId, String password) {
		
		this.mailId=mailId;
		this.name=name;
		this.phoneNo=phoneNo;
		this.password=password;
		
	}
	public StudentsLogin() {
		
	}
	
	public void studentslogin() {
		
		byte i=1;
		
		while(i<5) {
			
			if(i==1) {
				System.out.println("Enter Name");
				name=sc.next();
				i++;
			}
			else if(i==2) {
				System.out.println("Enter phoneNumber");
				phoneNo=sc.next();
				
				if(phoneNo.length()==10) {
					i++;
				}
				else {
					i=2;
				}
			}
			
			else if(i==3) {
				System.out.println("Enter MailID");
				mailId=sc.next();
				i++;
			}
			else if(i==4) {
				System.out.println("Enter Password");
				password=sc.next();
				i++;
			}
		}
		
		StudentsLogin detail=new StudentsLogin(name,phoneNo,mailId,password);
		map.put(mailId,detail);
		i++;
	}
	
	
	

}
