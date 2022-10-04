import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<n;i++) {
			int a=Integer.parseInt(s.substring(i,i+1));
			sum+=a;
		}
		System.out.println(sum);
	}
}