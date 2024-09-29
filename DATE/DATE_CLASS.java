package DATE;
import java.text.*;
import java.util.*;
public class DATE_CLASS {
	public static SimpleDateFormat formatter ;
	public static String str;
	
	public static void main(String[] a)
	{
		Date date=new Date();
		
		formatter=new SimpleDateFormat("dd/mm/yyyy");
		str=formatter.format(date);
		System.out.println("dd/mm/yy = "+str);
		
		formatter=new SimpleDateFormat("mm-dd-yyyy hh:mm:ss");
		str=formatter.format(date);
		System.out.println("\ndd/mm/yy  hh:mm:ss = "+str);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy");
		str=formatter.format(date);
		System.out.println("\ndd MMMM yyyy = "+str);
		
		formatter=new SimpleDateFormat("E,dd MMMM yyyy");
		str=formatter.format(date);
		System.out.println("\nE,dd MMMM yyyy = "+str);
		
		formatter=new SimpleDateFormat("E,dd MMMM yyyy zzzz");
		str=formatter.format(date);
		System.out.println("\nE,dd MMMM yyyy zzzz = "+str);
		
	}
}
