package practice.com;

public class MyArray {

	public static void main(String[] args) {
	
		String[] type=new String[5];
		type[0]="Apple";
		type[1]="Banana";
		type[2]="Orange";
		type[3]="Peach";
		type[4]="WaterMelon";
		
  System.out.println("Number of arrays"+type.length);
  
  for(int i=0; i <=type.length;i++){
	  System.out.println(i);
	  
	  for(String str:type){
		  System.out.println("My arrray is :"+str);
		  
		  if(type[0].equals(type[1])){
			  System.out.println("Not equal");
			  
			 
		  }else if(type[1].contains("a")){
			  System.out.println("Go and get job");
		  }else{
			  System.out.println("Take it easy");
		  }
	  }
  }
  
  
		
		
		
	}

}
