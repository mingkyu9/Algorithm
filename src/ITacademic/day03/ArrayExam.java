package ITacademic.day03;

public class ArrayExam {

	public static void main(String[] args) {
		//10개의 배열을 만든다.
		int[] arr=new int[10];
		//랜덤함수를 이용해서 배열에 값을 넣는다.
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*20)+1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
