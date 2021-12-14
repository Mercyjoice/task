package demo;
import java.util.*;

public class CFG 
{
private int a,b,c,d,e,f,g;
{
	//get set
}
	/**
 * @return the a
 */
public int getA() 
{
	return a;
}
@Override
	public int hashCode() {
		return Objects.hash(a);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CFG other = (CFG) obj;
		return a == other.a;
	}
	
	
	
	
	
public CFG(int a) {
		super();
		this.a = a;
	}
/**
 * @return the b
 */
public int getB() 
{
	return b;
}
public CFG() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @return the c
 */
public int getC() {
	return c;
}
/**
 * @return the d
 */
public int getD() {
	return d;
}





	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		String userName;
		//display message
		System.out.println("Enter you name");
		
	
		userName=obj.nextLine();
		
		//print and display
		System.out.println("your name is:"+userName);
		
	}

}

