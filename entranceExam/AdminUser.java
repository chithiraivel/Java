package entranceExam;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AdminUser {
	
	static Long userId=100001l;
	String name;
	String password;
	
	Scanner sc=new Scanner(System.in);
	
	static LinkedHashMap<Long,AdminUser> admin=new LinkedHashMap<Long,AdminUser>();
	
	public AdminUser(Long userId,String password,String name) {
		
		this.userId=userId;
		this.password=password;
		this.name=name;
		
	}

	public AdminUser() {
		
	}

	public void adminUser() {
		
		byte i=1;
		
		while(i<3) {
			
			if(i==1) {
				System.out.println(" userId"+userId);
				System.out.println("Enter UserName");
				name=sc.next();
			   i++;	
			}
			else if(i==2) {
				System.out.println("Enter password");
				password=sc.next();
				i++;
			}
		}
		AdminUser data2=new AdminUser(userId,password,name);
		admin.put(userId,data2);
		userId++;
		i++;
		
	}
	
	

}
