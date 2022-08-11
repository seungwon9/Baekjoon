import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a,max=-1000001,min=1000001;
		for(int i=0;i<n;i++) {
			a=Integer.parseInt(st.nextToken());
			if(a>max)
				max=a;
			if(a<min)
				min=a;
		}
		System.out.println(min+" "+max);
	}
}