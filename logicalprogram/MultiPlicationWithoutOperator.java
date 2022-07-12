package logicalprogram;

public class MultiPlicationWithoutOperator {

	public static void main(String[] args) {
		//5*4
		//5+5+5+5
		int a=5;
		int b=4; int sum=0;
		for(int i=1;i<=4;i++)//1->2
		{ sum=sum+a;//0+5->5; 5+5-->10
		}
		System.out.println("Multiplication is "+sum);
	
	
	}

}
