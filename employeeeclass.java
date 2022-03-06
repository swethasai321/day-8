package employee;
import java.util.Scanner;

public class employeeeclass {
	
	public static void main(String arg[])	
	{
	    double Gs,It,pf,netSalary;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter Gross salary");
                   Gs=sc.nextDouble();
	    System.out.println("enter Income Tax %");
                   It=sc.nextDouble();
	     System.out.println("enter Provident Fund %");
	pf=sc.nextDouble();
	     pf=pf*(Gs/100);
	     It=It*(Gs/100);
	     
	     netSalary=Gs-It-pf;
	     System.out.println("Net Salary is="+netSalary);
                   }
}