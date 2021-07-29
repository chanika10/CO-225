
import java.math.*;
import java.util.Random;
import java.io.*;

 class main {
	 public static void main(String [] args) {

System.out.println("Random value between 0-1 = " + Math.random()); 

		student objct1[]= new student [62];
		student ave=new student ();
	
		 BufferedReader descriptor = null; 
			String line = null; 
			String [] names = new String[62]; // 61 names 
			try { 
			    descriptor = new BufferedReader(
					    new FileReader("co225-classlist.txt"));

			    for(int i=0; i < names.length; i++) // assume file has 61 lines 
				names[i] = descriptor.readLine(); 

			    descriptor.close(); 

			} catch(IOException e) { 
			    // IOException is more generic (FileNotFound is a type of a 
			    // IOException, so catching only that is sufficient 
			    System.out.println("Bad things happen, what do you do!" + e);
			    return; 
			}

//obtaining the attendance
			int p;
			int count=0;
			
			for(int i=0;i<61;i++){
				objct1[i]=new student();
				
				double att=objct1[i].attend();
				
				if(att<80.0){
					System.out.println(names[i]+ "    " +att+"%" );//students with lower attendance than 80%
					count++;
				}
			}
			ave.average();//getting the average
			
	 }
}


	

			
		
		
