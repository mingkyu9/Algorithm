package ITacademic.day03;

public class ArrayExam {

	public static void main(String[] args) {
		//10���� �迭�� �����.
		int[] arr=new int[10];
		//�����Լ��� �̿��ؼ� �迭�� ���� �ִ´�.
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
