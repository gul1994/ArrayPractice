package practice.com;

public class SplitMethod {

	public static void main(String[] args) {
	 String title="I need a, lot of Java, Books";
	
	 String[] type=title.split(",");
	  
	 for(String str:type){
		 System.out.println(str);
	     System.out.println("__________________");
	 
	 }
	 
	 String book1="I have many kind of selenium books";
	 String[] book2=book1.split(" ");
	  for(String book3:book2){
		  System.out.println(book3);
	  }
		
		
		
	}

}
