public class StringMethods {
	 
	 public static void main(String args[]){
		 
		 System.out.println("String Methods");
		 
		 // 1.toCharArray()
		 // Convert string object into character Array
		 
		 /*String s1 = "Hello World ";
		 char[] s = s1.toCharArray();		 
		 for(int i=0;i<s.length;i++){
			 
			 System.out.println(s[i]);
		 }*/
		 
		 //2.charAt()
		 // To find a particular character at given index position
		 
		 /*String at = "Welcome";
		 char str1 = at.charAt(at.length()-1);
		 System.out.println(str1); */
		 
		 
		 //3.indexOf()
		 //first occurence of the given character
		 
		 //4.lastIndexOf()
		 //last occurence of the given character
		 
		 
		/* String s2  = "index position of string";
		 int index = s2.indexOf('i');
		 int index2 = s2.indexOf('i',12); // return the index of another
		 System.out.println(index2);
		 
		  int count = 0;
		  int startFrom = 0;
		 for(int i=0;i<s2.length();i++){
			 
			 int index3 = s2.indexOf('i',startFrom);
			 
			 if(index3>=0){
			 count = count+1;
			 startFrom=index3+1;
			
			 }	 
		 } 
		 System.out.println(count);	*/
		 
		 
		 //5.contains
		 // sequence of character in this string return true or false
		 
		 /*String str = "welcome to java";
		 boolean a = str.contains("to");
		 System.out.println(a);*/
		 
		 String s = "chithiraivel655@gmail.com"; 
		 
		 for(int i=0;i<s.length();i++){
			 
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				System.out.println(s.charAt(i));	
			}				
		 }
		 
	 }
}