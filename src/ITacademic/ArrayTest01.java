package ITacademic;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr01=new int[5];
		
		int[] arr02= {1,2,3,4,5};
		
		arr01[1]=10;
		
		for(int i=0;i<arr01.length;i++) {
			arr01[i]=(int)(Math.random()*20)+1;
		}
		System.out.println("arr01= "+arr01);
		System.out.println("arr02= "+arr02);
		System.out.println("arr01[2]= "+arr01[2]);
		System.out.println("arr01[1]= "+arr01[1]);
	}

}
