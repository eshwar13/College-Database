package college;
import java.util.Scanner ;
public class Super {

	static String a = "maths";
	static String b = "physics";
	static String c = "chemistry";
	 protected void course(String m1 , String m2)
     {
     	System.out.println( m1+"\n"+m2);
     }

	public static void main(String[] args) 
	{

        String e1 = "MIcroprocessor" ;
        String e2 = "Linear Integrated Circuits";
        String m1 = "Fluid Mechanics";
        String m2 = "Thermodynamics";
        String c1 = "Network theory";
        String c2 = "Operating systems";
         
       
}
}
 
class Base extends Super 
{
	 public static void main(String [] args)
	 {
		 String take ;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Departments \n1.ECE  \n2.Mechanical   \n3.CSE    \n ");
		 do
		 {
		  System.out.println("Choose your choice");
		  int choice = in.nextInt();
		  switch(choice)
		  {
		  case 1 :
			  System.out.println("  \n You have choosen ECE dept   Common subjects are : ");
			        System.out.println(a +"\n" + b +"\n" +c +"\n" );
			      System.out.println("ECE subjects are \n ");
			      Base obj = new Base();
			      obj.course( "MIcroprocessor",  "Linear Integrated Circuits \n");
			        break ;
			         
		  case 2 :
			    System.out.println(" \n You have choosen MECH dept  \n common subjects are :");
			    System.out.println(a +"\n" + b +"\n" +c +"\n" );
			    System.out.println("MECH subjects are : \n ") ;
			    Base obj1 = new Base();
			    obj1.course("Fluid Mechanics", " Thermo dynamics \n ");
			    break ;
			    
		  case 3 :
			  System.out.println(" \n You have choosen CSE dept  \n common subjects are :");
			    System.out.println(a +"\n" + b +"\n" +c +"\n" );
			    System.out.println("CSE subjects are : \n ") ;
			    Base obj3 = new Base();
			    obj3.course("NEtworking theroy", "Operating system \n");
			    break ;
			   
		  }
		  System.out.println(" TO Continue press Y ");
		  take = in.next();
	 }
		 while(take.equals("Y")||take.equals("y"));
	 
}
}

