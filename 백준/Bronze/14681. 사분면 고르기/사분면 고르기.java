import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>1000||x<-1000||x==0)
			return;
		int y=sc.nextInt();
		if(y>1000||y<-1000||y==0)
			return;
		if(x>0&&y>0)
			System.out.println("1");
		else if(x<0&&y>0)
			System.out.println("2");
		else if(x<0&&y<0)
			System.out.println("3");
		else if(x>0&&y<0)
			System.out.println("4");
	}

}
