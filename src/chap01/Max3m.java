package chap01;

public class Max3m {

	static int max3(int a,int b,int c) { //max 3 ¸Þ¼­µå
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
			}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) ="+max3(3,2,1));
		System.out.println("max3(3,2,2) ="+max3(3,2,2));
		System.out.println("max3(3,1,2) ="+max3(3,1,2));
		System.out.println("max3(3,2,3) ="+max3(3,2,3));
		System.out.println("max3(1,2,4) ="+max3(1,2,4));
		System.out.println("max3(3,2,5) ="+max3(3,2,5));
	}
}

