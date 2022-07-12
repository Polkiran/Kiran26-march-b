package pattern;

public class Eg2 {

	public static void main(String[] args) {
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		//row-->5 col-->5
		for(int i=1;i<=5;i++)// outer for loop--> row
		{
		for(int j=1;j<=5;j++)//inner for loop--> column
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}

}
