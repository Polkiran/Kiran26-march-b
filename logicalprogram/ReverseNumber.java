package logicalprogram;

public class ReverseNumber {

	public static void main(String[] args) {
		int orgNum=123;
		int revNum=0;
		//System.out.println(orgNum/10);
		// System.out.println(orgNum%10);
		//
		// System.out.println(12%10);
		// System.out.println(1%10);
		for(int i=orgNum;i>0;i=i/10)//123,12, 1
		{ int rem = i%10;//3,2,1
		revNum=revNum*10+rem;
		//3=0+3
		//32=3*10+2
		//321=320+1
		}
		System.out.println("Oroginal Number is "+orgNum);
		System.out.println("reverse Number is "+revNum);

	}

}
