package lineconversion;

import java.util.Scanner;

public class greaterline {
	Scanner scanner = new Scanner(System.in);
	double x1,x2,y1,y2,x3,y3,x4,y4;
	int line1,line2;
	
	//first line
	System.out.println("enter x1&y1 values of first point");
	x1=scanner.nextDouble();
	y1=scanner.nextDouble();
	
	System.out.println("enter x2&y2 values of second point");
	x2=scanner.nextDouble();
	y2=scanner.nextDouble();
	line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	System.out.println("Distance of first line = "+line1);
	//second line
	System.out.println("enter x3&y3 values of first point");
	x3=scanner.nextDouble();
	y3=scanner.nextDouble();
	
	System.out.println("enter x4&y4 values of second point");
	x4=scanner.nextDouble();
	y4=scanner.nextDouble();
	line2=(int)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
	
System.out.println("Distance of second line = "+line2);
//comparing
if 
(line1 > line2)
	System.out.println("line1 is greater");
else
	System.out.println("line2 is greater");
	
}
		

	
}

}

}
