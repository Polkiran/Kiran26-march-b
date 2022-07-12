package logicalprogram;

public class FactorialofNumber {

	public static void main(String[] args) {
		// 4!-->4*3*2*1=24
		int num=6; int num1=1;
		for(int i=num;i>=1;i--)//6,5,4,3,2,1
		{
			num1=num1*i;//6*1=6; 6*5=30; 4*30=120; 3*120=360; 2*360=720;
		}
		System.out.println("Factorial of number is "+num1);
	}

}
