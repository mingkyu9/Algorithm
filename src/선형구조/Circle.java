package 선형구조;

public class Circle {

	public static void main(String[] args) {
		CircleArrayQueue queue=new CircleArrayQueue(5);
		queue.enqueue("사과");
		queue.enqueue("바나나");
		queue.enqueue("딸기");
		queue.enqueue("귤");
		queue.enqueue("배");
		
		System.out.println(String.format("첫번째 값=>%s", queue.dequeue()));
		System.out.println(String.format("두번째 값=>%s", queue.dequeue()));
		System.out.println(String.format("세번째 값=>%s", queue.dequeue()));
		System.out.println(String.format("네번째 값=>%s", queue.dequeue()));
		System.out.println(String.format("다섯번째 값=>%s", queue.dequeue()));
		
		System.out.println("");
		System.out.println("--원형 큐이므르고 가용 공간을 재사용 할 수 있다--");
		queue.enqueue("체리");
		System.out.println(String.format("여섯번째 값=>%s", queue.dequeue()));
		if(queue.empty()) {
			System.out.println("---");
			System.out.println("큐가 빔");
		}
	}

}
