package chap02;

public class ArraySumForIn {

	public static void main(String[] args) {
		double[]a= {1.0,2.0,3.0,4.0,5.0};
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		double sum=0;
		for(double i:a) { //배열의 모든 요소를 스캔하는 과정에서 인덱스 자체의 값이 필요하지 않으면 그 스캔은 확장 for문에 의해 구현함
			sum+=i;
		}
		System.out.println("모든 요소의 합은 "+sum+"입니다");
	}
}
