package ��������;

public class Circle {

	public static void main(String[] args) {
		CircleArrayQueue queue=new CircleArrayQueue(5);
		queue.enqueue("���");
		queue.enqueue("�ٳ���");
		queue.enqueue("����");
		queue.enqueue("��");
		queue.enqueue("��");
		
		System.out.println(String.format("ù��° ��=>%s", queue.dequeue()));
		System.out.println(String.format("�ι�° ��=>%s", queue.dequeue()));
		System.out.println(String.format("����° ��=>%s", queue.dequeue()));
		System.out.println(String.format("�׹�° ��=>%s", queue.dequeue()));
		System.out.println(String.format("�ټ���° ��=>%s", queue.dequeue()));
		
		System.out.println("");
		System.out.println("--���� ť�̹Ǹ��� ���� ������ ���� �� �� �ִ�--");
		queue.enqueue("ü��");
		System.out.println(String.format("������° ��=>%s", queue.dequeue()));
		if(queue.empty()) {
			System.out.println("---");
			System.out.println("ť�� ��");
		}
	}

}
