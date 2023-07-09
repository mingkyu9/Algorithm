package ITacademic.day03;

public class DoubleForTest01 {

	public static void main(String[] args) {
		/*
		 * int gugu=2; for(int i=1;i<10;i++) { System.out.println(gugu
		 * +"*"+i+"="+(gugu*i));
		 * 
		 * }
		 */
	
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j +"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
