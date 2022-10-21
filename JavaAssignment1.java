import java.util.*;
class Demo2{
	static int big;
	static int greater(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				big=a;
			}
		}
		else if(b>c) {
			big=b;
		}
		else {
			big=c;
		}
		return big;
	}
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Read the value of a : ");
		a=s.nextInt();
		System.out.println("Read the value of b : ");
		b=s.nextInt();
		System.out.println("Read the value of c : ");
		c=s.nextInt();
		System.out.println(greater(a,b,c));
	}
}