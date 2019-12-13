package inheritance;

class parent
{
   int b ;
   char c ;
   void setx(int b1)
   {
	 System.out.println("i am the base class of set method  one");  
   }
}
   class child extends parent
   {
	   void setx(int c1) 
	   {
		   
	 System.out.println("i am the child class of set method");     
	   }
   }
   
public class base
{
	public static void main(String[] args)
	{
//     base ba = new base ();
//     ba.setx(20);
     child ch = new child();
     ch.setx(10);
	}

}