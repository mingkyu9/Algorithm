package BackJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader=
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenzer=
				new StringTokenizer(bufferedReader.readLine());
		int suNo=Integer.parseInt(stringTokenzer.nextToken());
		int quizNo=Integer.parseInt(stringTokenzer.nextToken());
		long[]S=new long[suNo+1];
		 stringTokenzer=
				new StringTokenizer(bufferedReader.readLine());
		for(int i=1;i<=suNo;i++) {
			S[i]=S[i-1]+Integer.parseInt(stringTokenzer.nextToken());
		}
		for(int q=0;q<quizNo;q++) {
			 stringTokenzer=
					new StringTokenizer(bufferedReader.readLine());
			 int i=Integer.parseInt(stringTokenzer.nextToken());
			 int j=Integer.parseInt(stringTokenzer.nextToken());
			 System.out.println(S[j]-S[i-1]);
		}
	}

}
